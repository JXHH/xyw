package rj7.dao.traveltip;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rj7.bean.Traveltip;
import rj7.util.Connect;
import rj7.util.DAOFactory;

/**
 * ����dao��ӿ�ʵ��
 * @author ����  2017.4.25
 * 
 */

public class TraveltipDAOImpl implements ITraveltipDAO { 
	//��id����
	public Traveltip findById(String postid, String tblname, String idtype)
	{
		return (Traveltip)DAOFactory.getDaoInstance().findById(tblname, postid, Traveltip.class,idtype);
	}
	//����������
	public boolean doCreate(Traveltip t) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connect conn=Connect.getInstance(); //��ȡ����ʵ��
		Date date=new Date();				//��ȡϵͳʱ�䲢���и�ʽ��
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=format.format(date);
	    t.setTime(time);
		String sql = "insert into tbltrveltip"
				+ "(id,time,usererid,tit,con,pic,viewcnt,likecnt,forwadcnt,commcnt)"
				+"values(?,?,?,?,?,?,?,?,?,?)";			//sql���
			ArrayList<Object> param=new ArrayList();		//paramΪ�����б�
			param.add(t.getId());							//��param����Ӳ���
			param.add(t.getTime());
			param.add(t.getUserid());
			param.add(t.getTit());
			param.add(t.getCon());
			param.add(t.getPic());
			param.add(t.getViewcnt());
			param.add(t.getLikecnt());
			param.add(t.getForwadcnt());
			param.add(t.getCommcnt());
		    if(conn.update(sql, param)!=0){					//ִ��sql��䷵��ִ�н����
			flag = true;
		    }
		    return flag;									//��ӳɹ�flag=true,����flag=false
	}

	@Override
	//ɾ��������
	public boolean doDelete(String id) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connect conn=Connect.getInstance();					//��ȡ����ʵ��
		String sql = "delete from tbltraveltip where id = ?";	//sql���
			ArrayList<Object> param=new ArrayList();		//paramΪ�����б�
			param.add(id);							//��param����Ӳ���id
		    if(conn.update(sql, param)!=0){					//ִ��sql��䷵��ִ�н����
			flag = true;
		    }
		    return flag;									//ɾ���ɹ�flag=true,����flag=false
	}

	@Override
	//�޸Ĺ�����
	public boolean doUpdate(Traveltip t) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connect conn=Connect.getInstance();					//��ȡ����ʵ��
		String sql = "update tbltrveltip set time=?,userid=?,tit=?,con=?,"
				+ "pic=?,viewcnt=?,likecnt=?,forwadcnt=?,commcnt=? "+
				"where id = ?";							//sql���
			ArrayList<Object> param=new ArrayList();		//paramΪ�����б�
			param.add(t.getTime());						//��param����Ӳ���
			param.add(t.getUserid());
			param.add(t.getTit());
			param.add(t.getCon());
			param.add(t.getPic());
			param.add(t.getViewcnt());
			param.add(t.getLikecnt());
			param.add(t.getForwadcnt());
			param.add(t.getCommcnt());
			param.add(t.getId());	
		    if(conn.update(sql, param)!=0){					//ִ��sql��䷵��ִ�н����
			flag = true;
		    }
		    return flag;									//��ӳɹ�flag=true,����flag=false
	}
	@Override
	//��ѯ���й���,����ʱע���пգ�
	public List<Object> findAll() throws Exception {
		// TODO Auto-generated method stub
		Connect conn=Connect.getInstance();					//��ȡ����ʵ��
		String sql = "select id,time,usererid,tit,con,pic,"
				+ "viewcnt,likecnt,forwadcnt,commcnt "
				+ "from tbltrveltip order by id";
		return conn.queryForArrObject(sql, null,Traveltip.class);//�޲���ʱ��paramΪnull
	}
}