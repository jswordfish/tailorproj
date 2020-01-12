package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.RegisteredUser;

@Service("userService")
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	
	public boolean addUser(RegisteredUser u1) {
		// TODO Auto-generated method stub
		if(userDao.addUser(u1)) {
			return true;
		}else{
			return false;
		}
		
	}

}
