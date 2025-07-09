package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.sumar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.00001);
    }

    @Test
    public void testRestar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.restar(5.6);
        cut.restar(-3.1);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-2.5, valorActual, 0.00001, "Error: la resta no funcionó");


    }

    @Test
    public void testMultiplicar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.multiplicar(5.6);

        // Verifico
        double valorActual = cut.getTotalMultiplicacionDivision();
        assertEquals(5.6, valorActual, 0.00001, "Error: la resta no funcionó");  
    }

    @Test
    public void testDividirValorDistintoCero() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.dividir(2);

        // Verifico
        double valorActual = cut.getTotalMultiplicacionDivision();
        assertEquals(0.5000, valorActual, 0.00001, "Error: la resta no funcionó");  
    }

    @Test
    public void testDividirValorIgualCero() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.dividir(0);

        // Verifico
        double valorActual = cut.getTotalMultiplicacionDivision();
        assertTrue(Double.isNaN(valorActual));  
    }
}
