package com.wmz.service;

import com.wmz.exception.BuyStockException;

public interface IBuyStockService {
	
	//开户
	void openAccount(String aname, double money);
	void openStock(String sname, int count);
	
	void buyStock(String aname, double money, String sname, int count) throws BuyStockException;

}
