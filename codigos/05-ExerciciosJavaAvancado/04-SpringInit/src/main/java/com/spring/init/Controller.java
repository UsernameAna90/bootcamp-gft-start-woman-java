package com.spring.init;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component // Diz pro spring se tratar de um bean
@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem() {
        return "Projeto Spring feito pelo Initializr";
    }
}
