package com.wmz.bean;

public class Stock {
	
	private Integer sid;
	private String sname;
	private int amount;
	
	public Stock(Integer sid, String sname, int amount) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.amount = amount;
	}
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Stock [sid=" + sid + ", sname=" + sname + ", amount=" + amount + "]";
	}
	
}
