package com.pmrajiv.loginMongo.repository;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.pmrajiv.loginMongo.dto.Users;

public interface UserRepository {

	List<Users> findByEmail(String emailId);
	
	List<Users> login(String email, String password);
	
	void save(Users user);
}
