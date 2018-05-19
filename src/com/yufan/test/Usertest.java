package com.yufan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yufan.dao.UserDao;
import com.yufan.entity.User;

public class Usertest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("/com/yufan/util/applicationContext.xml");
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		User u = new User(1, "yufan","yufan", true,20);
		userDao.saveUser(u);
		System.out.println("完成");
	}
}
