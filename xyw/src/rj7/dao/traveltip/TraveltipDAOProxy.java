package rj7.dao.traveltip;

import java.util.List;

import rj7.bean.Traveltip;

/**
 * ����dao�������
 * @author ������  2017.4.25
 * 
 */
public  class TraveltipDAOProxy implements ITraveltipDAO {

		private ITraveltipDAO dao = null;
		
		public TraveltipDAOProxy() {
			
			this.dao = new TraveltipDAOImpl();
		}
		//��id����
		
		public Traveltip findById(String id, String tblname ,String idtype) {
			
			return this.dao.findById(id, tblname, idtype);
		}
		
		public boolean doCreate(Traveltip t) throws Exception {
			// TODO Auto-generated method stub
			boolean flag = false;
			if(dao.doCreate(t)){
				flag = true;
			}
			return flag;
		}

		@Override
		//ɾ��������
		public boolean doDelete(String id) throws Exception {
			// TODO Auto-generated method stub
			boolean flag = false;
			if(this.dao.doDelete(id)){
				flag = true;
			}
			return flag;
		}
		//�޸Ĺ�����
		public boolean doUpdate(Traveltip t) throws Exception {
			// TODO Auto-generated method stub
			boolean flag = false;
			if(this.dao.doUpdate(t)){
				flag = true;
			}
			return flag;
		}
		@Override
		//�������й�����
		public List<Object> findAll() throws Exception {
			// TODO Auto-generated method stub
			List<Object> list = null;
			list = this.dao.findAll();
			return list; 
		}

	}

