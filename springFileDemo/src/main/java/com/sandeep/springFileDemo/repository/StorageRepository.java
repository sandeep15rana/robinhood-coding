package com.sandeep.springFileDemo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sandeep.springFileDemo.entity.FileData;


public interface StorageRepository extends MongoRepository<FileData, String> {
	
    Optional<FileData> findByName(String fileName);
}
