package com.fish.service;

import java.util.List;

import com.fish.pojo.User;

/**
 * 
 * @author zhaochaofeng
 *
 */
public interface IUserService {
	
	/**
	 * 获取所有用户
	 * @return
	 */
	public List<User> getUsers();
	
}
