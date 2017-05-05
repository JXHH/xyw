package rj7.dao.evaluate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import rj7.bean.Evaluate;
import rj7.util.Connect;
import rj7.util.DAOFactory;
/**
 * 会员dao层接口实�?
 * @author 梁爽�?  
 *
 */
//ԤԼ�ӿ�ʵ��
public  class EvaDAOImpl implements IEvaDAO {

		@Override
		//�������
		public boolean doCreate(Evaluate e) throws Exception {
			// TODO Auto-generated method stub
			boolean flag = false;
			Connect conn=Connect.getInstance(); //��ȡ����ʵ��
			Date date=new Date();				//��ȡϵͳʱ�䲢���и�ʽ��
			DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time=format.format(date);
		    e.setEvatime(time);
			String sql = "insert into tblevaluate"
					+ "(evaid,evatime,pjuserid,bpjuserid,evastar,evacont)"
					+"values(?,?,?,?,?,?)";			//sql���
				ArrayList<Object> param=new ArrayList();		//paramΪ�����б�
				param.add(e.getEvaid());							//��param����Ӳ���
				param.add(e.getEvatime());
				param.add(e.getPjuserid());
				param.add(e.getBpjuserid());
				param.add(e.getEvastar());
				param.add(e.getEvacont());
				if(conn.update(sql, param)!=0){					//ִ��sql��䷵��ִ�н����
				flag = true;
			    }
			    return flag;									//��ӳɹ�flag=true,����flag=false
		}
	
		@Override
		//ɾ������
		public boolean doDelete(String evaid) throws Exception {
			// TODO Auto-generated method stub
			boolean flag = false;
			Connect conn=Connect.getInstance();					//��ȡ����ʵ��
				String sql = "delete from tblevaluate where evaid = ?";	//sql���
				ArrayList<Object> param=new ArrayList();		//paramΪ�����б�
				param.add(evaid);							//��param����Ӳ���id
				if(conn.update(sql, param)!=0){					//ִ��sql��䷵��ִ�н����
				flag = true;
			    }
			    return flag;									//ɾ���ɹ�flag=true,����flag=false
		}
	
		@Override
		//�޸�����
		public boolean doUpdate(Evaluate e) throws Exception {
			// TODO Auto-generated method stub
			boolean flag = false;
			Connect conn=Connect.getInstance();					//��ȡ����ʵ��
			String sql = "update tblevaluate set evatime=?,pjuserid=?,"
					+"bpjuserid=?,evastar=?,evacont=? where evaid = ?";					//sql���
				ArrayList<Object> param=new ArrayList();                          //paramΪ�����б�
				param.add(e.getEvatime());               //��param����Ӳ���
				param.add(e.getPjuserid());
				param.add(e.getBpjuserid());
				param.add(e.getEvastar());
				param.add(e.getEvacont());
				param.add(e.getEvaid());
			    if(conn.update(sql, param)!=0){					//ִ��sql��䷵��ִ�н����
				flag = true;
			    }
			    return flag;									//��ӳɹ�flag=true,����flag=false
		}
		
		@Override
		//��ѯ��������,����ʱע���пգ�
		public List<Object> findAll() throws Exception {
			Connect conn=Connect.getInstance();					//��ȡ����ʵ��
			String sql = "select evaid,evatime,pjuserid,bpjuserid,evastar,evacont"
					+ " from tblevaluate order by evaid";
			return conn.queryForArrObject(sql, null,Evaluate.class);//�޲���ʱ��paramΪnull
		}

		@Override
		//�����û�id����,����ʱע���пգ�
		public List<Object> findByuserid(String userid) throws Exception {
			// TODO Auto-generated method stub
			Connect conn=Connect.getInstance();					//��ȡ����ʵ��
			String sql = "select evaid,evatime,pjuserid,bpjuserid,evastar,evacont"
					+ " from tblreserve where yyuserid = ? or byyuserid =?";
			ArrayList<Object> param=new ArrayList();		//paramΪ�����б�
			param.add(userid);
			return  conn.queryForArrObject(sql, param,Evaluate.class);//��List<Object>��ʽ����
		}

		@Override
		//���������Ǽ������ң�����ʱ��ע���п�
		public List<Object> findBystar(String evastar) throws Exception {
			// TODO Auto-generated method stub
			Connect conn=Connect.getInstance();					//��ȡ����ʵ��
			String sql = "select evaid,evatime,pjuserid,bpjuserid,evastar,evacont"
					+ " from tblevaluate where evastar = ?";
			ArrayList<Object> param=new ArrayList();		//paramΪ�����б�
			param.add(evastar);
			return  conn.queryForArrObject(sql, param,Evaluate.class);//��List<Object>��ʽ����
		}

	
	
	//��������id���ң�����ʱ��ע���п�
	public Object findByid(String id, String tblname, String idname) {
		
		return (Evaluate)DAOFactory.getDaoInstance().findById(tblname, id, Evaluate.class, idname);
	}

}