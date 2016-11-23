package com.struts.tutorial.action2;

import com.opensymphony.xwork2.Action;

public class Action02 implements Action {
	
	private String id, pw, msg;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMsg() {
		return msg;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("id:" + id);
		System.out.println("pw:" + pw);
		if ("root".equalsIgnoreCase(id)) {
			return ERROR;
		}
		if ("admin".equals(id) && "1234".equals(pw)) {
			this.id = id;
			msg = "관리자님 환영합니다";
			return SUCCESS;
		}
		return INPUT;
	}

}
