package com.sandeep.springFileDemo.service;

import java.io.IOException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sandeep.springFileDemo.SpringFileDemoApplication;
import com.sandeep.springFileDemo.entity.FileData;
import com.sandeep.springFileDemo.repository.StorageRepository;

@Service
public class StorageService {

    // Logger added 
    private static final Logger logger = LoggerFactory.getLogger(SpringFileDemoApplication.class);

    @Autowired
    private StorageRepository repository;

    public String uploadFile(MultipartFile file) throws IOException {

    	logger.info("Storage block started executing...");
    	
//        FileData fileData = FileData.builder()
//                .name(file.getOriginalFilename())
//                .type(file.getContentType())
//                .fileData(file.getBytes())
//                .build();

    	FileData fileData = new FileData.Builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .fileData(file.getBytes())
                .build();

        repository.save(fileData);
        logger.info("File uploaded successfully...");

        return "File uploaded successfully: " + file.getOriginalFilename();
    }

    public FileData downloadFile(String fileName) {
    	
    	logger.info("Storage Downloading block started executing...");
    	
        return repository.findByName(fileName).orElse(null);
    }
    
    // Implementing getFileByName method
    public FileData getFileByName(String fileName) {
        Optional<FileData> fileData = repository.findByName(fileName);
        return fileData.orElseThrow(() -> new RuntimeException("File not found with name: " + fileName));
    }
    
}
