package com.soumik.sample.service;
import java.util.List;

import com.soumik.sample.dao.UserDao;
import com.soumik.sample.service.UserService;


public class UserServiceImpl implements UserService {

	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<String> getUsers() throws Exception {
		return userDao.show();
	}

	@Override
	public String addUser(String username) throws Exception {
		return userDao.add(username);
	}

}
