package rj7.dao.chat;

import java.util.ArrayList;

import rj7.bean.Chat;

public interface IChatDAO {
	public boolean ChatUser(Chat chat) throws Exception;// ���������
	public boolean DsdeChatUser(Chat chat) throws Exception; //��ʱɾ����Ϣ
	public boolean SddeChatUser(Chat chat) throws Exception;// ɾ���ض�����Ϣ
	public ArrayList<Chat> find(Chat chat) throws Exception;//���е������¼
	public ArrayList<Chat> findByDay(Chat chat) throws Exception;//�����ѯ�����¼
	public ArrayList<Chat> findByWord(Chat chat) throws Exception;//���ؼ��ֲ�ѯ�����¼
}
