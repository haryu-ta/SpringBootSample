package com.example.form;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Size(min=1,max=50)
	private String name;
	
	@NotNull
	@Size(min=9,max=11)
	private String tel;
	
	@NotNull
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date dateOfBirth;
	
	private EmailValue email;
	
	private boolean worker;

	private String[] hobbys;
	
	private String horse;

}
