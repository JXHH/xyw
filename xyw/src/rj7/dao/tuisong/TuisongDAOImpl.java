package rj7.dao.tuisong;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import rj7.bean.Tuisong;
import rj7.util.Connect;
//���ͽӿ�ʵ��

public class TuisongDAOImpl implements TuisongDAO {
	@Override
	//�������
	public boolean doCreate(Tuisong t) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connect conn=Connect.getInstance();
		//��ȡ����ʵ��
		String sql = "insert into tbltuisong"
				+ "(tid,admid,ttype,thead,tcontent,ttime,tstatus,browsecnt,dianzancnt,zhuanfacnt,pingluncnt)"
				+"values(?,?,?,?,?,?,?,?,?,?,?)";			//sql���
			ArrayList<Object> param=new ArrayList();		//paramΪ�����б�
			param.add(t.getTid());							//��param����Ӳ���
			param.add(t.getAdmid());
			param.add(t.getTtype());
			param.add(t.getThead());
			param.add(t.getTcontent());
			param.add(t.getTtime());
			param.add(t.getTstatus());
			param.add(t.getBrowsecnt());
			param.add(t.getDianzancnt());
			param.add(t.getZhuanfacnt());
			param.add(t.getPingluncnt());
		    if(conn.update(sql, param)!=0){					//ִ��sql��䷵��ִ�н����
			flag = true;
		    }
		    return flag;									//��ӳɹ�flag=true,����flag=false
	}

	@Override
	//ɾ������
	public boolean doDelete(String tid) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connect conn=Connect.getInstance();					//��ȡ����ʵ��
		String sql = "delete from tbltuisong where tid = ?";	//sql���
			ArrayList<Object> param=new ArrayList();		//paramΪ�����б�
			param.add(tid);							//��param����Ӳ���id
		    if(conn.update(sql, param)!=0){					//ִ��sql��䷵��ִ�н����
			flag = true;
		    }
		    return flag;									//ɾ���ɹ�flag=true,����flag=false
	}

	@Override
	//�޸�����
	public boolean doUpdate(Tuisong t) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connect conn=Connect.getInstance();					//��ȡ����ʵ��
		String sql = "update tbltuisong set admid=?,ttype=?,thead=?,tcontent=?,ttime=?,"
				+ "tstatus=?,browsecnt=?,dianzancnt=?,zhuanfacnt=?,pingluncnt=?"+
				"where tid = ?";							//sql���
			ArrayList<Object> param=new ArrayList();		//paramΪ�����б�
			param.add(t.getAdmid());						//��param����Ӳ���
			param.add(t.getTtype());
			param.add(t.getThead());
			param.add(t.getTcontent());
			param.add(t.getTtime());
			param.add(t.getTstatus());
			param.add(t.getBrowsecnt());
			param.add(t.getDianzancnt());
			param.add(t.getZhuanfacnt());
			param.add(t.getPingluncnt());
			param.add(t.getTid());	
		    if(conn.update(sql, param)!=0){					//ִ��sql��䷵��ִ�н����
			flag = true;
		    }
		    return flag;									//��ӳɹ�flag=true,����flag=false
	}
}
