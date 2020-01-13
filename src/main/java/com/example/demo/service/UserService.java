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
		/**
		 * Write Implementation
		 */
		return false;
	}
	
	public Integer getNonRegisteredUsersCount() {
		/**
		 * Write Implementation
		 */
		return 0;
	}
	
	public Integer getUserRegistrationsInPipelineCountUsers() {
		/**
		 * Write Implementation
		 */
		return 0;
	}
	
	public Integer getSuspendUsersCountUsers() {
		/**
		 * Write Implementation
		 */
		return 0;
	}
	
	

}
