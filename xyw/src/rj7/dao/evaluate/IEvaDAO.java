package rj7.dao.evaluate;
import rj7.bean.Evaluate;
import rj7.bean.Reserve;
import java.util.List;
public interface IEvaDAO {
		//ԤԼ�ӿ�
		
		public boolean doCreate(Evaluate e)throws Exception;//��������
		public boolean doDelete(String id)throws Exception;//ɾ������
		public boolean doUpdate(Evaluate e)throws Exception;//��������
		public List<Object> findAll()throws Exception;//������������
	    public Object findByid(String id, String tblname,String idname)throws Exception;	//��������id����
		public List<Object> findByuserid(String userid) throws Exception;//�����û�id����
		public List<Object> findBystar(String evastar) throws Exception;//�����Ǽ�������

	 
	}
