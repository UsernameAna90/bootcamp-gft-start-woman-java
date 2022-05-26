package com.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean // Instancia o livro
    public Livro getLivro() {
        return new Livro();
    }

    @Bean
    public AutorLivro getSAutorLivro() {
        return new Autor();
    }
}
