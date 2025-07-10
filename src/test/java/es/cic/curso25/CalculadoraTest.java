package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

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
        cut.sumar(4.2);

        // Ejecuto
        cut.multiplicar(2);
        cut.multiplicar(-1);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-8.4, valorActual, 0.00001, "Error: la resta no funcionó");  
    }

    @Test
    public void testDividir() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);

        // Ejecuto
        cut.dividir(2);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(2.1, valorActual, 0.00001, "Error: la resta no funcionó");
    }

    //@Disabled
    @Test()
    public void testDividirPorCero() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);

        // Ejecuto
        assertThrows(ArithmeticException.class,
            () -> cut.dividir(0));
    }
} 
