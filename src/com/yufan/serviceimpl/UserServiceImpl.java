package com.yufan.serviceimpl;

import java.util.List;

import com.yufan.dao.UserDao;
import com.yufan.entity.User;
import com.yufan.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(User user) {
		return	userDao.queryUserById(user.getId());
	}

	@Override
	public List<User> queryUser() {
		return userDao.queryUser();
	}

}
