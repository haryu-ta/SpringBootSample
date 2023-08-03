package com.example.servletfilter;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.util.CommonUtil;

@Component
public class CustomServletListner implements ServletRequestListener {
	
	@Autowired
	CommonUtil util;

	private static final Logger logger = LoggerFactory.getLogger(CustomServletListner.class);
	
	@Override 
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
		logger.info("□■□■□■□■□■□■CustomServletListner start□■□■□■□■□■□■");
		logger.info(req.getRequestURI());
		util.exec();
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		logger.info("□■□■□■□■□■□■CustomServletListner stop□■□■□■□■□■□■");
	}
	
}
