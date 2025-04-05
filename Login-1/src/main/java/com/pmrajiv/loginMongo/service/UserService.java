package com.pmrajiv.loginMongo.service;

import java.util.List;

import com.pmrajiv.loginMongo.dto.Users;

public interface UserService {

	String saveUser(Users userDetails);
	
	Users findUserById(Users userDetails);
	
	List<Users> findUserByEmail(String emailId);
}
