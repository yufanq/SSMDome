package com.yufan.service;

import java.util.List;

import com.yufan.entity.User;

/**
 * 
* @ClassName: UserService  
* @Description: 针对User类的 业务逻辑操作 
* @author 雨ゆこ
* @date 2018年3月7日  
*  
*
 */
public interface UserService {
	/**
	 * 
	* @Title: login  
	* @Description: 登录查询判断  
	* @param @return    参数  
	* @return User    返回类型  
	* @throws
	 */
	User login(User user);
	/**
	 * 
	* @Title: queryUser  
	* @Description:  查询所有用户  
	* @param @return    参数  
	* @return List<User>    返回类型  
	* @throws
	 */
	List<User> queryUser();
	
	
}
