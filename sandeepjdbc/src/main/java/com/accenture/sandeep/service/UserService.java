package com.accenture.sandeep.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.sandeep.controller.modal.User;
import com.accenture.sandeep.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class UserService {
	
	// Initialising a Logger 
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;
	
	public Optional<User> getUser(Integer id){
		
		logger.info("Fetching user with id ");
		return userRepository.findById(id);
		
	}
	
	public User createUser(User user) {
		logger.info("Creating user with id ");
		return userRepository.save(user);
	}
	
	public void deleteUser(Integer id) {
		logger.info("Deleting user with id ");
		userRepository.deleteById(id);
	}
	
	public List<User> getAllUsers(){
		logger.info("Listing users with id ");
		return userRepository.findAll();
	}
	
	public User updateUser(Integer id, User userDetails) {
		Optional<User> optionalUser = userRepository.findById(id);
		
		if(optionalUser.isPresent()) {
			User user = optionalUser.get();
			user.setName(userDetails.getName());
			user.setAge(userDetails.getAge());
			user.setEmail(userDetails.getEmail());
			
			return userRepository.save(user);
		}
		
        logger.warn("User with id {} not found", id);
        
		return null;
	}
}
