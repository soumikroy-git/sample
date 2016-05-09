package com.soumik.sample.service;

import java.util.List;

public interface UserService {
	
	public List<String> getUsers() throws Exception;
	
	public String addUser(String user) throws Exception;
	
}
