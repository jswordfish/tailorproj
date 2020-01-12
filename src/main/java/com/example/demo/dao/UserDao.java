package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RegisteredUser;
import com.example.demo.repository.RegisteredUserRepository;

@Repository("userDao")
public class UserDao {
	
	@Autowired
	RegisteredUserRepository registeredUserRepository;
	
	public boolean addUser(RegisteredUser u1) {
		// TODO Auto-generated method stub
		
		if(registeredUserRepository.saveAndFlush(u1) != null) {
			return true;
		}else{
			return false;
		}
		
		
	}

}
