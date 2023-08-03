package com.example.util;

import org.springframework.core.convert.converter.Converter;

import com.example.form.EmailValue;

public class StringToEmailValueConverter implements Converter<String,EmailValue> {

	@Override
	public EmailValue convert(String source) {
		EmailValue email = new EmailValue();
		email.setValue(source);
		return email;
	}

}
