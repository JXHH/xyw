package rj7.dao.fans;
import rj7.bean.Fans;
import rj7.dao.fans.FansDAOImpl;
import rj7.util.Connect;

public class FansDAOProxy implements IFansDAO{
	Connect conn = Connect.getInstance();
	FansDAOImpl dao = new FansDAOImpl();
	
	//�����ѹ�ע
	public boolean FansUser(Fans fans) throws Exception{
		
		 boolean flag=false;
		 try
		 { 
			flag=dao.FansUser(fans); 
		 }
		 catch(Exception e)
		 { throw e; }
		 return flag; 
	 }
	 
	//������ȡ����ע
	public boolean UnFansUser(Fans fans) throws Exception{
		 boolean flag=false;
		 try
		 { 
			 flag=dao.UnFansUser(fans);  
		 }
		 catch(Exception e)
		 { throw e; }
		 return flag; 
	 }
	
	//��ѯ���з�˿
	public Fans findById(String userid) throws Exception{
		Fans fans = new Fans();
		 try
		 { 
			 fans = dao.findById(userid); 
		 }
		 catch(Exception e)
		 { throw e; }
		 return fans;
	}
}
