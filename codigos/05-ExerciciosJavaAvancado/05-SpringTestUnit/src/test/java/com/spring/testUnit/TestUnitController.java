package com.spring.testUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spring.testUnit.controller.TesteController;
import org.junit.jupiter.api.Test;

public class TestUnitController {

    @Test
    public void testUnit() {
        TesteController controller = new TesteController();
        String resultado = controller.saudacao("Ana");
        assertEquals("Bem vindo(a), Ana", resultado);
    }

}
