package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example"})
public class SpringVariousApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVariousApplication.class, args);
	}

}
