package com.example.reflect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
public class ReflectionService2 {

    private String firstName;

    public String getFullName(String lastName){
        return lastName + firstName;
    }
}
