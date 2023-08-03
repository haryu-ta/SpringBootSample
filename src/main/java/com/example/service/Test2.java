package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class Test2 {

    private String returnString = "abc";

    public String method2(String param){
        return returnString;
    }

    public String metod(){
        return "method";
    }
}
