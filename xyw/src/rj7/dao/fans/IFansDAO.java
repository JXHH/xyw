package rj7.dao.fans;

import rj7.bean.Fans;

public interface IFansDAO {
	 public boolean FansUser(Fans fans) throws Exception; //�����ѹ�ע
	 public boolean UnFansUser(Fans fans) throws Exception;//������ȡ����ע
	 public Fans findById(String userid) throws Exception;//��ѯ���з�˿
}

