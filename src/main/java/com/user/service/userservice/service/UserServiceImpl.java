package com.user.service.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.userservice.pojo.User;
import com.user.service.userservice.repo.UserRepository;

@Service
public class UserServiceImpl 
{
	
	@Autowired
	UserRepository repository;

	public List<User> fatchUserList() {
		
		return repository.findAll();
	}
	

}
