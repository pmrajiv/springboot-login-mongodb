package com.pmrajiv.loginMongo.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.pmrajiv.loginMongo.dto.Users;
import com.pmrajiv.loginMongo.repository.UserRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public List<Users> findByEmail(String emailId) {

		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(emailId));

		//mongoTemplate.getCollection("login");
		List<Users> userData = mongoTemplate.find(query, Users.class, "login");
		System.out.println("--");
		System.out.println(userData);
		return userData;
	}

	@Override
	public List<Users> login(String email, String password) {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(email).and("password").is(password));

		mongoTemplate.getCollection("product_data");
		List<Users> userData = mongoTemplate.find(query, Users.class);
		
		return userData;
	}

	@Override
	public void save(Users user) {
		mongoTemplate.save(user,"user");
		
	}

}
