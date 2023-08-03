package com.example.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;


import static com.sun.javaws.JnlpxArgs.verify;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest(classes={Test1.class,Test2.class})
class Test1Test {

    private Test1 target;

    @Mock
    private Test2 mockedClass;

    @BeforeEach
    void init(){
        target = new Test1(mockedClass);
    }

    @Test
    void テスト(){
        Mockito.when(mockedClass.method2(any())).thenReturn("123");

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        String result = target.method("1");

        Mockito.verify(mockedClass,Mockito.times(1)).method2(captor.capture());
        String param  = captor.getValue();

        assertThat(result,is("123"));
        assertThat(param,is("1"));
    }

    @Test
    void テスト2(){

    }
}