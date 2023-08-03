package com.example.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.anyString;

@SpringBootTest(classes={Test1.class,Test2.class})
class Test1_1Test {

    @Spy
    private Test2 mockedClass;

    @InjectMocks
    private Test1 test;

    @BeforeEach
    void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void テスト(){
        Mockito.when(mockedClass.method2(anyString())).thenReturn("itamura");
        //Mockito.when(mockedClass.metod()).thenReturn("itamura2");

        assertThat(test.method("kitano"),is("itamura"));
    }

}