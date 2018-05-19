package com.yufan.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yufan.dao.UserDao;
import com.yufan.entity.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/com/yufan/util/applicationContext.xml")
public class UserDaoTest {
	@Autowired
	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Test
	public void testQueryUser() {
		System.out.println("查看全部");
		System.out.println(userDao.queryUser());
	}

	@Test
	public void testQueryUserById() {
		System.out.println(userDao.queryUserById(1));
	}

	@Test
	public void testRemoveUserById() {
		userDao.removeUserById(1);
	System.out.println("删除成功");
	}

	@Test
	public void testUpdataUser() {
		User user = new User(2,"yuxiaofan","yufana",false,19);
		userDao.updataUser(user);
		System.out.println(userDao.queryUserById(2));
	}

	@Test
	public void testSaveUser() {
		User u = new User(1, "yufan","yufan", true,20);
		userDao.saveUser(u);
		System.out.println("完成");
	}

}
