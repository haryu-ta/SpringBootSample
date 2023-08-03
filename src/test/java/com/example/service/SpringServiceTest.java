package com.example.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.SpringVariousApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringVariousApplication.class)
public class SpringServiceTest {

	@Autowired
	SpringService service;
	
	@Test
	public void Serviceテスト1() {
		
		String result = service.exec(1);
		assertThat(result,is("i"));
		
	}

}
