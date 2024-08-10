package com.sandeep.springFileDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sandeep.springFileDemo.entity.FileData;
import com.sandeep.springFileDemo.service.StorageService;

@RestController
@RequestMapping("/files")
public class FileController {

	
    @Autowired
    private StorageService service;

    // Logger added 
    private static final Logger logger = LoggerFactory.getLogger(FileController.class);
    		
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestPart("file") MultipartFile file) {
    	
    	logger.info("Upload block initiated in controller..");
    	
        String message = "";
        try {
            message = service.uploadFile(file);
            return ResponseEntity.status(HttpStatus.OK).body(message);
        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
        }
    }

    @GetMapping("/download")
    public ResponseEntity<byte[]> downloadFile(@RequestParam("fileName") String fileName) {
    	
    	logger.info("Download block initiated in controller..");
    	
        FileData fileData = service.downloadFile(fileName);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(fileData.getType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileData.getName() + "\"")
                .body(fileData.getFileData());
    }
}
