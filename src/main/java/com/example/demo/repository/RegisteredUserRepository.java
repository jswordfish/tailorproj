package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.RegisteredUser;

public interface RegisteredUserRepository extends JpaRepository<RegisteredUser, Number>{

	

}
