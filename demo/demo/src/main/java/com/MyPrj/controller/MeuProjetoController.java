package com.MyPrj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuProjetoController {
    @GetMapping("/test")
    public String helloWorld(){
        return "Hello,World";
    } 
    
}
