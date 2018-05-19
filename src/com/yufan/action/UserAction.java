package com.yufan.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yufan.service.UserService;

public class UserAction extends ActionSupport{
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	

}
