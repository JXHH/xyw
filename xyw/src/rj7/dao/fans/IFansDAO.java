package rj7.dao.fans;

import java.util.ArrayList;
import rj7.bean.Fans;

public interface IFansDAO {
	 public boolean FansUser(Fans fans) throws Exception; //�����ѹ�ע
	 public boolean UnFansUser(Fans fans) throws Exception;//������ȡ����ע
	 public ArrayList <Fans> findById(String userid) throws Exception;//��ѯ���з�˿
}

