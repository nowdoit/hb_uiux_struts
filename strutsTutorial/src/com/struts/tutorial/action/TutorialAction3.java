package com.struts.tutorial.action;

public class TutorialAction3 {
	
	private String msg;

	// �信 ������ ��
	public String getMsg() {
		return msg;
	}
	
	// �Ķ���� �� ���� ��
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String execute() {
		System.out.println(msg);
		return "success";
	}
}
