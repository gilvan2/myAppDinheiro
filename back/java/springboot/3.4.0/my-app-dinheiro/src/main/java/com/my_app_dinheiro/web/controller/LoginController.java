package com.my_app_dinheiro.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/java/springboot/3.4.0")
public class LoginController {
    @GetMapping
    public String teste(){
        return "Um simples teste para saber que o spring ta funcionando";
    }
}
