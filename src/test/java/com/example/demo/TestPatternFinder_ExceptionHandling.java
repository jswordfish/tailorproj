package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.RegisteredUser;
import com.example.demo.service.UserService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPatternFinder_ExceptionHandling {
	@Autowired
	UserService userService;
	
	@Test(expected=DemoException.class)
    public void testFindNoOfOccurrences1Boundary() throws Exception{
        userService.addUser(new NRUser());
    }
}

class NRUser extends RegisteredUser{
	
}