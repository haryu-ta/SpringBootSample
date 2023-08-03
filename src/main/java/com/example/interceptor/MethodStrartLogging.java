package com.example.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodStrartLogging {
	
	@Before("execution(* com.example.controller.SpringController.*(..))")
	public void startLog(JoinPoint jp) {
		System.out.println("=========" + jp.getSignature());
	}

}
