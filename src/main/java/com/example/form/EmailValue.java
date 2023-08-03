package com.example.form;


import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class EmailValue {
	
		//@Size(max = 5)
		@Email
		private String value;
		
		public void setValue(String value) {this.value = value;}
		public String getValue() {return value;}
		public String toString() {
			return getValue();
		}
		

}
