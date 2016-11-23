package com.hb.action;

import com.hb.model.GuestDao;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport {
	private int sabun;
	private String name;
	private int pay;

	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	public String execute() throws Exception {
		new GuestDao().insertOne(sabun, name, pay); 
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		if (sabun == 0 || "".equals(sabun)) {
			addFieldError("sabun", "사번 값이 비었습니다");
		} else if (sabun > 9999) {
			addFieldError("sabun", "사번은 최대 4자리입니다");
		}
	}
}
