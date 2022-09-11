package com.SpringBoot.SpringBoot_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/aruna")
    public String helloWorld(){

        return "Hello Aruna Jyothi";
    }
}
