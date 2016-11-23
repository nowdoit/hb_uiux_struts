package com.struts.tutorial.action;

public class TutorialAction2 {
	
	private String msg;
	private String msg2;

	public String getMsg() {
		return msg;
	}
	public String getMsg2() {
		return msg2;
	}
	public String execute() {
		msg = "Tutorial Message!";
		msg2 = "Tutorial Message2!!";
		return "success";
	}
}
