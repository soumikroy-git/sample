package com.soumik.sample.faccade;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.soumik.sample.delegate.UserViewDelegate;

public class UserServiceFaccadeJson {

	private UserViewDelegate userViewDelegate;
	private final Gson gson;
	public UserServiceFaccadeJson() {
		gson = new GsonBuilder().serializeNulls().create();
	}

	public UserViewDelegate getUserViewDelegate() {
		return userViewDelegate;
	}

	public void setUserViewDelegate(UserViewDelegate userViewDelegate) {
		this.userViewDelegate = userViewDelegate;
	}
	
	public String getUsers() throws Exception {
		List<String> userList = userViewDelegate.getUsers();
		return gson.toJson(userList);
	}
	
	public String addUser(String userName) throws Exception {
		
		String message = userViewDelegate.addUser(userName);
		return gson.toJson(message);
	}
}
