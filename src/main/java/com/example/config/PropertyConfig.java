package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.form.EmailValue;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Getter
@Setter
public class PropertyConfig {
	
	@Value("${application.startDate}")
	private java.time.LocalDate startDate;
	
	@Value("${application.endDate}")
	@DateTimeFormat(pattern="uuuu/MM/dd")	
	private java.time.LocalDate endDate;
	
	@Value("${application.email}")
	private EmailValue email;

}
