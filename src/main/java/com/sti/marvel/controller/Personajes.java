package com.sti.marvel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Personajes {

    @GetMapping("/characters")
    public String characters(){
        return "hola mundo";
    }
}
