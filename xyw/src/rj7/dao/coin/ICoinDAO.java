package rj7.dao.coin;

import rj7.bean.Coin;

public interface ICoinDAO {
	 public boolean CoinUser(Coin coin) throws Exception; //��ע����
	 public boolean UnCoinUser(Coin coin) throws Exception;//ȡ����ע
	 public Coin findById(String userid) throws Exception;//��ѯ�ѱ���ע�ĺ���
}
