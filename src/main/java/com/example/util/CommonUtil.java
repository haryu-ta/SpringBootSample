package com.example.util;

import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class CommonUtil {
	
	public void exec() {
		System.out.println("common util");
	}
	
	public void convert() {
		FormattingConversionServiceFactoryBean factoryBean = new FormattingConversionServiceFactoryBean();
		factoryBean.afterPropertiesSet();
		ConversionService conversionService = factoryBean.getObject();
		// 文字列配列
		for( String  val : conversionService.convert("a,b,c", String[].class)) {
			System.out.println("========= : " + val + " =========");
		}
		
	}

}
