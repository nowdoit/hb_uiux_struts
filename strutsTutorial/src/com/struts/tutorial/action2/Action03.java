package com.struts.tutorial.action2;

import com.opensymphony.xwork2.ActionSupport;

public class Action03 extends ActionSupport {
    private String id, pw, msg;
	
    public void setId(String id) {
		this.id = id;
	}
    public void setPw(String pw) {
		this.pw = pw;
	}
    public String getId() {
		return id;
	}
    public String getPw() {
		return pw;
	}
    
    public String getMsg() {
		return msg;
	}
	public String formView() {
		System.out.println("------> formView() run!!!");
		return "input";
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("------> execute() run!!!");
		msg = "id:" + id + ", pw:" + pw + "�� �α���";
		return SUCCESS;
	}
	@Override
	public void validate() {
		System.out.println("------> validate() run!!!");
		if (id == null) System.out.println("id:null");
		if ("".equals(id)) System.out.println("id:empty space");
		
		if (id == null) {
			//���ʿ� null�̹Ƿ� �н�
		} else if ("".equals(id)) {
			addFieldError("id", "���� �����!!!");
		} else if (id.length() < 4) {
			addFieldError("id", "id�� 4�ڸ� �̻��̾�� �մϴ�.");
		}
		if (pw == null) {
			//���ʿ� null�̹Ƿ� �н�
		} else if ("".equals(pw)) {
			addFieldError("pw", "pw is empty!");
		} else if (pw.length() < 6) {
			addFieldError("pw", "pw�� 6�ڸ� �̻��̾�� �մϴ�.");
		}
	}
}
