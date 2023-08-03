package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebViewController {

    @GetMapping(value="/introduction")
    public String introduction(){
        return "introduction";
    }

    @GetMapping(value="/next")
    public String next() { return "next";}

    @GetMapping(value="/test")
    public String test(){
        return "test";
    }

    @GetMapping(value="/test2")
    public String test2(){
        return "test2";
    }
}
