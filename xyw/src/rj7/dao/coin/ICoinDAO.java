package rj7.dao.coin;

import java.util.ArrayList;

import rj7.bean.Coin;

public interface ICoinDAO {
	 public boolean CoinUser(Coin coin) throws Exception; //��ע����
	 public boolean UnCoinUser(Coin coin) throws Exception;//ȡ����ע
	 public ArrayList <Coin> findById(String userid) throws Exception;//��ѯ�ѱ���ע�ĺ���
}
