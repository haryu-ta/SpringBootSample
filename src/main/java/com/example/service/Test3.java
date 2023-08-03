package com.example.service;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class Test3 {

    private String param = "abc";
    public String method(){
        return param;
    }

}
