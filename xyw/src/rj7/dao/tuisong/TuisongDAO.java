package rj7.dao.tuisong;

import rj7.bean.Tuisong;
//���ͽӿ�
public interface TuisongDAO {
	public boolean doCreate(Tuisong t)throws Exception;
	public boolean doDelete(String t)throws Exception;
	public boolean doUpdate(Tuisong t)throws Exception;
}
