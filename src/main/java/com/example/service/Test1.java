package com.example.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Test1 {

    @NonNull
    private Test2 test;


    public String method(String param1){
        System.out.println("====1====");
        System.out.println(test.metod());
        return test.method2(param1);

    }

}
