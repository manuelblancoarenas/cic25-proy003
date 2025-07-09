package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    // Preparo
    Calculadora cut = new Calculadora();
    @Test
    public void testSumar() {
        // Ejecuto
        cut.sumar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.00001);
    }

    @Test
    public void testRestar() {
        // Ejecuto
        cut.restar(5.6);
        cut.restar(-3.1);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-2.5, valorActual, 0.00001, "Error: la resta no funcionó");
    }


}
