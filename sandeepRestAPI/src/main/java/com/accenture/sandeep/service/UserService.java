package com.accenture.sandeep.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.accenture.sandeep.controller.modal.User;

@Service
public class UserService {
	
	private List<User> userList;
	
	public UserService() {
		
		userList = new ArrayList<User>();
		
		User user1 = new User( 1,  "Sandeep",  26,  "rana@gmail.com");
		User user2 = new User( 2,  "Max",  34,  "max@gmail.com");
		User user3 = new User( 3,  "Jones",  35,  "dean@gmail.com");
		User user4 = new User( 4,  "Gill",  22,  "gill@gmail.com");
		User user5 = new User( 5,  "Pant", 26,  "pant@gmail.com");
		User user6 = new User( 6,  "Rohit",  36,  "sharma@gmail.com");
		
		userList.addAll(Arrays.asList(user1,user2,user3,user4,user5,user6));
		
	}
	
	public Optional<User> getUser(Integer id){
		
		Optional optional = Optional.empty();
		
		for (User user : userList) {
			if(id == user.getId()) {
				optional = Optional.of(user);
				return optional;
			}
		}
		
		return optional;
	}
	
	
}
