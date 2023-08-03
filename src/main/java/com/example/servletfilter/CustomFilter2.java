package com.example.servletfilter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CustomFilter2 implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(CustomFilter2.class);
	
	@Override
	public void init(FilterConfig filterConfig){
		logger.info("□■□■□■□■□■□■CustomFilter2 Init□■□■□■□■□■□■");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		logger.info("□■□■□■□■□■□■CustomFilter2 start□■□■□■□■□■□■");
		chain.doFilter(request, response);
		logger.info("□■□■□■□■□■□■CustomFilter2 end□■□■□■□■□■□■");

	}
	
	@Override
	public void destroy() {
		logger.info("□■□■□■□■□■□■CustomFileter2 Destroy□■□■□■□■□■□■");
	}

}
