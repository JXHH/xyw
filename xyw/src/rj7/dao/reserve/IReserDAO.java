package rj7.dao.reserve;
import rj7.bean.Reserve;
import java.util.List;
public interface IReserDAO {
		//ԤԼ�ӿ�
		
		public boolean doCreate(Reserve r)throws Exception;//����ԤԼ
		public boolean doDelete(String r)throws Exception;//ɾ��ԤԼ
		public boolean doUpdate(Reserve r)throws Exception;//����ԤԼ
		public List<Object> findAll()throws Exception;//��������ԤԼ
	    public Object findByid(String id, String tblname,String idname)throws Exception;	//����ԤԼid����
		public List<Object> findByuserid(String userid) throws Exception;//�����û�id����
		public List<Object> findBycity(String resercity) throws Exception;//����ԤԼ���в���
	 
	}
