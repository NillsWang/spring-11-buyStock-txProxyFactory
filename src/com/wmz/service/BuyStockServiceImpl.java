package com.wmz.service;

import com.wmz.dao.IAccountDao;
import com.wmz.dao.IStockDao;
import com.wmz.exception.BuyStockException;

public class BuyStockServiceImpl implements IBuyStockService {

	private IAccountDao adao;
	private IStockDao sdao;
	
	public IAccountDao getAdao() {
		return adao;
	}

	public void setAdao(IAccountDao adao) {
		this.adao = adao;
	}

	public IStockDao getSdao() {
		return sdao;
	}

	public void setSdao(IStockDao sdao) {
		this.sdao = sdao;
	}

	@Override
	public void openAccount(String aname, double money) {
		// TODO Auto-generated method stub
		adao.insertAccount(aname, money);

	}

	@Override
	public void openStock(String sname, int count) {
		// TODO Auto-generated method stub
		sdao.insertStock(sname, count);

	}

	@Override
	public void buyStock(String aname, double money, String sname, int count) 
			throws BuyStockException {
		// TODO Auto-generated method stub
		boolean isBuy = true;
		adao.updateAccount(aname, money, isBuy);
		if(true) {
			throw new BuyStockException("购买股票没有成功");
		}
		sdao.updateStock(sname, count, isBuy);
	}

}
