package com.sandeep.springFileDemo.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sandeep.springFileDemo.entity.FileData;
import com.sandeep.springFileDemo.repository.StorageRepository;

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

        return "File uploaded successfully: " + file.getOriginalFilename();
    }

    public FileData downloadFile(String fileName) {
        return repository.findByName(fileName).orElse(null);
    }
    
    // Implementing getFileByName method
    public FileData getFileByName(String fileName) {
        Optional<FileData> fileData = repository.findByName(fileName);
        return fileData.orElseThrow(() -> new RuntimeException("File not found with name: " + fileName));
    }
    
}
