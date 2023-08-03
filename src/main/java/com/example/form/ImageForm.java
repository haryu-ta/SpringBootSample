package com.example.form;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ImageForm {
	
    private MultipartFile image;

}
