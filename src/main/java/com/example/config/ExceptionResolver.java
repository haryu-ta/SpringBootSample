package com.example.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView modelAndView = new ModelAndView();
		if (ex instanceof MultipartException && ex.getCause() instanceof IllegalStateException ) {
            modelAndView.addObject("status", "500");
            modelAndView.addObject("error", ex);
            modelAndView.addObject("message", "error file exeed");
            modelAndView.setViewName("redirect:/form/output2");
        } else {
            modelAndView.setViewName("error");
        }
        return modelAndView;
	}

}
