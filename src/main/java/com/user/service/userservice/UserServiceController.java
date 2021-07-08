package com.user.service.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.userservice.pojo.User;
import com.user.service.userservice.service.UserServiceImpl;

@RestController
public class UserServiceController {
	
	
	@Autowired
	UserServiceImpl service;
	
	
	@GetMapping("/user")
	public List<User> fatchUserList(){
		
		return service.fatchUserList();
	}

}
