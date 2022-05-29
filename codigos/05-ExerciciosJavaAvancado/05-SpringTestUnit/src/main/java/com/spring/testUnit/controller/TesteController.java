package com.spring.testUnit.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    public String saudacao(@RequestParam(name = "nome", defaultValue = "Pessoa") String nome) {
        return "Bem vindo(a), " + nome;
    }
}
