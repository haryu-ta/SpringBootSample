package com.example.form;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EchoForm implements Serializable{

	private static final long serialVersionUID = 1L;

	@NotEmpty(message="{message.A02}")
	private String text;
	
	@Email(message="{message.A03}")
	private String email;

}
