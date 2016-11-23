package com.struts.tutorial.action;

public class TutorialAction3 {
	
	private String msg;

	// 뷰에 전달할 때
	public String getMsg() {
		return msg;
	}
	
	// 파라미터 값 받을 때
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String execute() {
		System.out.println(msg);
		return "success";
	}
}
