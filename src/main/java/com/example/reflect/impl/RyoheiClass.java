package com.example.reflect.impl;

import com.example.reflect.ReflectService;
import org.springframework.stereotype.Component;

@Component
public class RyoheiClass implements ReflectService {
    @Override
    public String getName() {
        return "亮平";
    }
}
