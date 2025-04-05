package com.pmrajiv.loginMongo.dto;



import org.springframework.data.annotation.Id;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {

	@Id
	ObjectId id;
	String name;
	String email;
	String password;
}
