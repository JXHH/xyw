package rj7.dao.chat;

import rj7.bean.Chat;

public interface IChatDAO {
	public boolean ChatUser(Chat chat) throws Exception;// ���������
	public boolean DsdeChatUser(Chat chat) throws Exception; //��ʱɾ����Ϣ
	public boolean SddeChatUser(Chat chat) throws Exception;// ɾ���ض�����Ϣ
	public Chat find(Chat chat) throws Exception;//���е������¼
	public Chat findByDay(Chat chat) throws Exception;//�����ѯ�����¼
	public Chat findByWord(Chat chat) throws Exception;//���ؼ��ֲ�ѯ�����¼
}
