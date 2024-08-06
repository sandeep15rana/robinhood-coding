package com.sandeep.springFileUpload.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.springFileUpload.entity.FileData;

public interface StorageRepository extends JpaRepository<FileData, Long>{
	
	Optional<FileData> findByName(String fileName);

}
