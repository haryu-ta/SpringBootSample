package com.example.reflect.impl;

import com.example.reflect.ReflectService;
import org.springframework.stereotype.Component;

@Component
public class KanaClass implements ReflectService {
    @Override
    public String getName() {
        return "佳奈";
    }
}
