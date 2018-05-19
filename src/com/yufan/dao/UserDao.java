package com.yufan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yufan.entity.User;

/**
 * 
* @ClassName: UserDao  
* @Description: user类的操作
* @author 雨ゆこ
* @date 2018年3月6日  
*  
*
 */
public interface UserDao {
	/**
	 * 
	* @Title: queryUser  
	* @Description:  查询所有 user对象 
	* @param @return    参数  
	* @return List<User>    返回类型  
	* @throws
	 */
	List<User> queryUser();
	/**
	 * 
	* @Title: queryUserById  
	* @Description:  根据id查找 user对象 
	* @param @param id
	* @param @return    参数  
	* @return User    返回类型  
	* @throws
	 */
	User queryUserById(@Param("id")Integer id);
	/**
	 * 
	* @Title: removeUserById  
	* @Description: 根据id 删除 user对象  
	* @param @param id    参数  
	* @return void    返回类型  
	* @throws
	 */
	void removeUserById(@Param("id")Integer id);
	/**
	 * 
	* @Title: updataUser  
	* @Description: 更新 user对象  
	* @param @param user    参数  
	* @return void    返回类型  
	* @throws
	 */
	void updataUser(User user);
	/**
	 * 
	* @Title: saveUser  
	* @Description: 添加 user对象  
	* @param @param user    参数  
	* @return void    返回类型  
	* @throws
	 */
	void  saveUser(User user);
}
