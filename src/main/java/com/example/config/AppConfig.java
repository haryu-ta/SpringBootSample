package com.example.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.web.multipart.support.MultipartFilter;

import com.example.util.StringToEmailValueConverter;

@Configuration
public class AppConfig {

	@Bean
	public ConversionService conversionService() {	
		DefaultFormattingConversionService cs = new DefaultFormattingConversionService();
		cs.addConverter(new StringToEmailValueConverter());
		return cs;
	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}	
	
//    @Bean
//    public Filter multipartFilter() {
//        MultipartFilter filter = new MultipartFilter();
//        return filter;
//    }	
	
}
