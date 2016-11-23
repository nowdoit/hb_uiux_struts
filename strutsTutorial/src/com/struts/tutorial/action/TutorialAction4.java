package com.struts.tutorial.action;

public class TutorialAction4 {
	
	private String actionRunner() {
		System.out.println("actionRunner run");
		return "success";
	}
	
	public String execute() {
		System.out.println("execute run");
		return "success";
	}
}
