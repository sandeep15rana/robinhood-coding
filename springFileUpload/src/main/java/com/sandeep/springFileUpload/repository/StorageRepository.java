package com.sandeep.springFileUpload.repository;

import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.sandeep.springFileUpload.entity.FileData;

public interface StorageRepository extends MongoRepository<FileData, Long>{
	
	Optional<FileData> findByName(String fileName);
}
