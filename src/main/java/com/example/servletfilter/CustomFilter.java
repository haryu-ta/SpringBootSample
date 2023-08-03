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
@Order(2)
public class CustomFilter implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(CustomFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig){
		logger.info("□■□■□■□■□■□■CustomFilter Init□■□■□■□■□■□■");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		logger.info("□■□■□■□■□■□■CustomFilter start□■□■□■□■□■□■");
//		System.out.println(request.getLocalPort());
//		System.out.println(request.getProtocol());
//		System.out.println(request.getServerName());
//		// URLパラメータが存在するする場合には取得
//		Map<String,String[]> param = request.getParameterMap();
//		for(String[] val : param.values()) {
//			System.out.println(val[0]);
//		}
		chain.doFilter(request, response);
		logger.info("□■□■□■□■□■□■CustomFilter end□■□■□■□■□■□■");

	}
	
	@Override
	public void destroy() {
		logger.info("□■□■□■□■□■□■CustomFilter Destroy□■□■□■□■□■□■");
	}

}
