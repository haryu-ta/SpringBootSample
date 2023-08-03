package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.controller.FormInputController;

@Service
public class SpringService {
	
	private static final Logger logger = LoggerFactory.getLogger(new Object().getClass());
	
	public String exec(int kbn) {
		logger.info("実行クラス ： {}","Service");
		switch(kbn){
		case 1: 
			return "i";
		case 2:
			return "t";
		case 3:
			return "a";
		default:
			return "r";
		}
	}

}
