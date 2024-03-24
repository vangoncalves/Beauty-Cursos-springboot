package com.example.projetoteste1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cadastro/")
public class cadastrocontroller {
    @GetMapping
    public String cadastro (){
        return "cadastro";
    }
}
