package rj7.dao.chat;

import rj7.bean.Chat;
import rj7.util.Connect;

public class ChatDAOProxy implements IChatDAO{
	Connect conn = Connect.getInstance();
	ChatDAOImpl dao = new ChatDAOImpl();
	//�ͺ�������
	public boolean ChatUser(Chat chat) throws Exception{
		boolean flag=false;
		 try
		 { 
			flag=dao.ChatUser(chat);
		 }
		 catch(Exception e)
		 { throw e; }
		 return flag; 
	}
	
	//��ʱɾ����Ϣ
	public boolean DsdeChatUser(Chat chat) throws Exception{
		boolean flag=false;
		 try
		 { 
			flag=dao.DsdeChatUser(chat);
		 }
		 catch(Exception e)
		 { throw e; }
		 return flag; 
	}
	
	//ɾ���ض�����Ϣ
	public boolean SddeChatUser(Chat chat) throws Exception{
		boolean flag=false;
		 try
		 { 
			flag=dao.SddeChatUser(chat);
		 }
		 catch(Exception e)
		 { throw e; }
		 return flag; 
	}
	
	//���е������¼
    public Chat find(Chat chat) throws Exception{
    	Chat chat1 = new Chat();
		 Chat chat2 = new Chat();
		 try{
			 chat1 = dao.find(chat2);
		 }
		 catch(Exception e)
		 {
			 throw e;
		 }
		 return chat1;
    }
	
	//�����ѯ�����¼
	 public Chat findByDay(Chat chat) throws Exception{
		 Chat chat1 = new Chat();
		 Chat chat2 = new Chat();
		 try{
			 chat1 = dao.findByDay(chat2);
		 }
		 catch(Exception e)
		 {
			 throw e;
		 }
		 return chat1;
	 }
	 
	//���ؼ��ֲ�ѯ�����¼
		 public Chat findByWord(Chat chat) throws Exception{
			 Chat chat1 = new Chat();
			 Chat chat2 = new Chat();
			 try{
				 chat1 = dao.findByWord(chat2);
			 }
			 catch(Exception e)
			 {
				 throw e;
			 }
			 return chat1;
		 }
}
