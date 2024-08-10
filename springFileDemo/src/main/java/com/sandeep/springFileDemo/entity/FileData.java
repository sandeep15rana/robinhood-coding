package com.sandeep.springFileDemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "files")
public class FileData {

    @Id
    private String id;

    private String name;
    private String type;

    private byte[] fileData;

	public byte[] getFileData() {
		// TODO Auto-generated method stub
		return fileData;
	}

    // Getters and Setters
	
	public String getName() {
	    return name;
	}

	public String getType() {
	    return type;
	}

}







//package com.sandeep.springFileUpload.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Lob;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "files")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class FileData {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String type;
//
//    @Lob
//    @Column(name = "file_data", length = 1000)
//    private byte[] fileData;
//}
