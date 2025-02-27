package com.MeuProjeto.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorld {
    @GetMapping("/teste")
    public String helloWorld() {
        return "Ola mundo, Hello World";
    }
    
    
    
}
