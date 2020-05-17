package com.wmz.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

	@Override
	public void insertAccount(String aname, double money) {
		// TODO Auto-generated method stub
		String sql = "insert into account(aname, balance) values(?, ?)";
		this.getJdbcTemplate().update(sql, aname, money);
	}

	@Override
	public void updateAccount(String aname, double money, boolean isBuy) {
		// TODO Auto-generated method stub
		String sql = "update account set balance = balance + ? where aname = ?";
		if(isBuy ==true) {
			sql = "update account set balance = balance - ? where aname = ?";
		}
		this.getJdbcTemplate().update(sql, money, aname);

	}

}
