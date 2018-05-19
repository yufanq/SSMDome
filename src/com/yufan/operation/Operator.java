package com.yufan.operation;

/**
 * 
* @ClassName: Operator  
* @Description: 抽象类  操作
* @author 雨ゆこ
* @date 2018年3月7日  
*  
*
 */
public abstract class Operator {
	/**
	 * 
	* @Title: getResult  
	* @Description:  抽象方法 计算两个数运算的结果a
	* @param @param n1
	* @param @param n2
	* @param @return    参数  
	* @return double    返回类型  
	* @throws
	 */
	public abstract double getResult(double n1, double n2);
}
