package rj7.dao.chat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import rj7.bean.Chat;
import rj7.util.Connect;

public class ChatDAOImpl implements IChatDAO{
	Connect conn=Connect.getInstance();
	//���������
	public boolean ChatUser(Chat chat) throws Exception{
        boolean flag=false;
 		String sql = "insert into tblchat (messageid,messages,sendtime,fromuserid,touserid,mastype)"
 				+ "values (?,?,STR_TO_DATE(?,'%Y-%m-%d %H:%i:%s'),?,?,?)";
 		ArrayList param=new ArrayList();
 		param.add(chat.getMessageid());
 	 	param.add(chat.getMessages());
 		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String time=format.format(date);
	    System.out.print(time); 
		param.add(time);
		param.add(chat.getFromuserid());
		param.add(chat.getTouserid());
		param.add(chat.getMastype());
 		int result = conn.update(sql, param);
 		if(result>0){
 			flag = true;
 		}
 		return flag;
     }
     
     public boolean DsdeChatUser(Chat chat) throws Exception{//��ʱɾ����Ϣ
    	 boolean flag=false;
     	Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String time=format.format(date);
     	String sql = "delete from tblchat where year(sendtime) = (year(?)-0.5)";
     	List<Object> param = new ArrayList<Object>();
		param.add(time);
        int result = conn.update(sql, param);
        if(result>0){
 			flag = true;
 		}
 		return flag;
     }
     
     public boolean SddeChatUser(Chat chat) throws Exception{//�ֶ�ɾ����Ϣ
    	 boolean flag=false;
     	String sql = "delete from tblchat where messageid = ?";
     	List<Object> param = new ArrayList<Object>();
		param.add(chat.getMessageid());
        int result = conn.update(sql, param);
        if(result>0){
 			flag = true;
 		}
 		return flag;
     }
     
     //���е������¼
     public Chat find(Chat chat) throws Exception{
    	 String sql = "select messages,sendtime,fromuserid from tblchat"
    	 		+ "where fromuserid = ? and touserid = ? ";
    	 List<Object> param = new ArrayList<Object>();
    	 param.add(chat.getFromuserid());
    	 param.add(chat.getTouserid());
    	 ArrayList<Chat> message=(ArrayList)conn.
					queryForArrObject(sql, param, Chat.class);
    	 return message.get(0);
     }
     
     //�������Ϣ��¼
     public Chat findByDay(Chat chat) throws Exception{
    	 String sql = "select messages,sendtime,fromuserid from tblchat"
    	 		+ "where fromuserid = ? and touserid = ? and sendtime = ?";
    	 List<Object> param = new ArrayList<Object>();
    	 param.add(chat.getFromuserid());
    	 param.add(chat.getTouserid());
    	 param.add(chat.getSendtime());
    	 ArrayList<Chat> message=(ArrayList)conn.
					queryForArrObject(sql, param, Chat.class);
    	 return message.get(0);
     }
     
     //���ؼ��ֲ���Ϣ��¼
     public Chat findByWord(Chat chat) throws Exception
     {
    	 String sql = "select messages,sendtime,fromuserid from tblchat"
     	 		+ "where fromuserid = ? and touserid = ? and messages like '%?%'";
     	 List<Object> param = new ArrayList<Object>();
     	 param.add(chat.getFromuserid());
     	 param.add(chat.getTouserid());
     	 param.add(chat.getMessages());
     	 ArrayList<Chat> message=(ArrayList)conn.
 					queryForArrObject(sql, param, Chat.class);
     	 return message.get(0);
     }
}
