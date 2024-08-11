package com.accenture.sandeep.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.accenture.sandeep.controller.modal.User;

public interface UserRepository extends MongoRepository<User, Integer>{

}
