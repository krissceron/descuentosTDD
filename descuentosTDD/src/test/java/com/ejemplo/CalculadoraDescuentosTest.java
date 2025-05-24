package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescuentosTest {
    @Test
    public void testDescuentoPorcentaje10() {
        assertEquals(90.0, CalculadoraDescuentos.aplicarDescuentoPorcentaje(100.0, 10.0));
    }
}