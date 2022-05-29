package com.spring.testUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

@WebMvcTest // Usada para realizar testes do tipo web
@ExtendWith(SpringExtension.class) // Para usar recursos do JUnit
public class TestIntController {

    // Respondavel por criar um ending point pra fazer requisições no servidor
    @Autowired
    private MockMvc mvc;

    @Test
    public void testInt() throws Exception {
        RequestBuilder requisicao = get();
        MvcResult resultado = mvc.perform(requisicao).andReturn();
        assertEquals("Bem vindo(a), Pessoa", resultado.getResponse().getContentAsString());
    }
}
