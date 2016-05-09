package com.soumik.sample.delegate;

import java.util.List;

import com.soumik.sample.service.UserService;

public class UserViewDelegate {
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public List<String> getUsers() throws Exception{
		return userService.getUsers();
	}
	public String addUser(String userName) throws Exception{
		return userService.addUser(userName);
	}
}
