package rj7.dao.coin;

import dbc.DatabaseConnection;

import rj7.bean.Coin;
import rj7.util.Connect;

public class CoinDAOProxy implements ICoinDAO{
	Connect conn = Connect.getInstance();
	CoinDAOImpl dao = new CoinDAOImpl();
	//��ע����
	 public boolean CoinUser(Coin coin) throws Exception{
		
		 boolean flag=false;
		 try
		 { 
			flag=dao.CoinUser(coin); 
		 }
		 catch(Exception e)
		 { throw e; }
		 return flag; 
	 }
	 
	 //ȡ����ע
	 public boolean UnCoinUser(Coin coin) throws Exception{
		 boolean flag=false;
		 try
		 { 
			flag=dao.UnCoinUser(coin); 
		 }
		 catch(Exception e)
		 { throw e; }
		 return flag; 
	 }
	 
	 //��ѯ�����ѹ�ע�ĺ���
	 public Coin findById(String userid) throws Exception{
		 Coin coin = new Coin();
		 try
		 { 
			coin = dao.findById(userid); 
		 }
		 catch(Exception e)
		 { throw e; }
		 return coin;
	 }
}
