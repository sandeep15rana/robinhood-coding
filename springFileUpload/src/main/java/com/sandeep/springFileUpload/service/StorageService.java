package com.sandeep.springFileUpload.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sandeep.springFileUpload.entity.FileData;
import com.sandeep.springFileUpload.repository.StorageRepository;

@Service
public class StorageService {
	
	@Autowired
	private StorageRepository repository;
	
	public String uploadFile(MultipartFile file) throws IOException {
		
		FileData fileData = FileData.builder()
	            .name(file.getOriginalFilename())
	            .type(file.getContentType())
	            .fileData(file.getBytes())
	            .build();
		
        repository.save(fileData);
        
	}
	
}
