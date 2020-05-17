package com.wmz.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StockDaoImpl extends JdbcDaoSupport implements IStockDao {

	@Override
	public void insertStock(String sname, int count) {
		// TODO Auto-generated method stub
		String sql = "insert into stock(sname, amount) values(?, ?)";
		this.getJdbcTemplate().update(sql, sname, count);
	
	}

	@Override
	public void updateStock(String sname, int count, boolean isBuy) {
		// TODO Auto-generated method stub
		String sql = "update stock set amount = amount - ? where sname = ?";
		if(isBuy ==true) {
			sql = "update stock set amount = amount + ? where sname = ?";
		}
		this.getJdbcTemplate().update(sql, count, sname);

	}

}
