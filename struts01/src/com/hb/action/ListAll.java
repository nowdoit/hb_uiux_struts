package com.hb.action;

import java.util.List;

import com.hb.model.GuestDao;
import com.opensymphony.xwork2.Action;

public class ListAll implements Action {
	private List list;
	public List getList() {
		return list;
	}
	@Override
	public String execute() throws Exception {
		GuestDao dao = new GuestDao();
		list = dao.selectAll();
		
		return SUCCESS;
	}
}
