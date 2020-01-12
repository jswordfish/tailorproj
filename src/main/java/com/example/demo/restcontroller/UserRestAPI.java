package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.RegisteredUser;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(methods = { RequestMethod.OPTIONS, RequestMethod.GET, RequestMethod.POST })
public class UserRestAPI {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@RequestBody RegisteredUser u1) {
		
		System.out.println(u1.getEmail());
		System.out.println(u1.getUserName());
		
		/*int gender = Integer.parseInt(u1.getGender());
		int userType = Integer.parseInt(u1.getUserTypeCustomerTailor());
		
		if(gender == 1) {
			u1.setGender("male");
		}else if(gender == 2) {
			u1.setGender("female");
		}else if(gender == 3) {
			u1.setGender("other");
		}
		
		if( userType ==  1) {
			u1.setUserTypeCustomerTailor("tailor");
		}else if(userType == 2) {
			u1.setUserTypeCustomerTailor("customer");
		}*/
		
		if(userService.addUser(u1)) {
			return "user added";
		}else {
			return "Add User Fail";
		}
		
		
		
		
		
	}
	
	
}
