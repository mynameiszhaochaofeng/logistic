package com.fish.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fish.pojo.User;
import com.fish.service.IUserService;

/**
 * 用户信息实现方法
 * @author zhaochaofeng
 *
 */
@Service
public class UserService implements IUserService{

	@Override
	public List<User> getUsers() {
		//我们可以在这个方法中与数据库打交道  
        List<User> list=new ArrayList<User>();  
        list.add(new User(1,"Mary","123456"));  
        list.add(new User(2,"Jack","236547"));  
        list.add(new User(3,"Joy","362541"));  
        return list;  
	}

}
