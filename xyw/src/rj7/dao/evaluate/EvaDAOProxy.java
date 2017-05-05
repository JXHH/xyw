package rj7.dao.evaluate;


import rj7.bean.Evaluate;
import java.util.*;
import rj7.util.Connect;

//ԤԼ�Ĵ�����
public class EvaDAOProxy implements IEvaDAO {
	EvaDAOImpl dao =  new EvaDAOImpl();
	Connect conn = Connect.getInstance();
	
	@Override
	//����ԤԼ
	public boolean doCreate(Evaluate e) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(dao.doCreate(e)){
			flag = true;
		}
		return flag;
	}

	@Override
	//ɾ��ԤԼ
	public boolean doDelete(String evaid) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(this.dao.doDelete(evaid)){
			flag = true;
		}
		return flag;
	}
	//�޸�����
	public boolean doUpdate(Evaluate r) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(this.dao.doUpdate(r)){
			flag = true;
		}
		return flag;
	}

	
	@Override
	//��������
	public List<Object> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Object> list = null;
		list = this.dao.findAll();
		return list; 
	}
	
	
	
	//��������id����
	public Object findByid(String id,String tblname,String idname) throws Exception {
		// TODO Auto-generated method stub
		Object obj = null;
		obj = this.dao.findByid(id,tblname,idname);
		return obj; 
	}
	
	
	@Override
	//���û�id����
	public List<Object> findByuserid(String userid) throws Exception {
		// TODO Auto-generated method stub
		List<Object> list = null;
		list = this.dao.findByuserid(userid);
		return list; 
	}


	@Override
	//���������Ǽ�������
	public List<Object> findBystar(String evastar) throws Exception {
		// TODO Auto-generated method stub
		List<Object> list = null;
		list = this.dao.findBystar(evastar);
		return list; 
	}
}



