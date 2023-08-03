package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.interceptor.CustomHandlerInterceptor;

@Configuration
public class HandlerInterceptorConfig implements WebMvcConfigurer  {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(new CustomHandlerInterceptor()).addPathPatterns("/form/regist").excludePathPatterns("/static/**");
			
		
	}

}
