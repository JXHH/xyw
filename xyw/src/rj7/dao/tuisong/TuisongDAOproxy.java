package rj7.dao.tuisong;

import rj7.bean.Tuisong;
import rj7.util.Connect;

//���͵Ĵ�����
public class TuisongDAOproxy implements TuisongDAO {
	TuisongDAOImpl dao =  new TuisongDAOImpl();
	Connect conn = Connect.getInstance();
	@Override
	//��������
	public boolean doCreate(Tuisong t) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(dao.doCreate(t)){
			flag = true;
		}
		return flag;
	}

	@Override
	//ɾ������
	public boolean doDelete(String tid) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(this.dao.doDelete(tid)){
			flag = true;
		}
		return flag;
	}
	//�޸�����
	public boolean doUpdate(Tuisong t) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(this.dao.doUpdate(t)){
			flag = true;
		}
		return flag;
	}

	

}
