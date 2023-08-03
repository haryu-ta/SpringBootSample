package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ImageForm;

@Controller
@RequestMapping("/image")
public class ImageControler {
	
	
    @ModelAttribute
    public ImageForm setForm() {
        return new ImageForm();
    }
	
	@GetMapping
	public String disp() {
		return "image/index";
		
	}
	
	@PostMapping(path="/upload")
	public String upload( ImageForm imageForm) {
		System.out.println("GoGo");
		System.out.println(imageForm.getImage().getOriginalFilename());
		return "image/index";
	}
	
	@GetMapping(path="/show")
	public String dispImage() {
		return "image/dispImage";
	}

}
