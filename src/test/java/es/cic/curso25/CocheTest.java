package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

public class CocheTest {

    private Coche cut; //lo declaro porque, si sólo lo usase en BeforeEach, al estar entre llaves sólo estaría accesible entre las llaves
    @BeforeEach
    public void setUp() {
        cut = new Coche();
    }

    @Test
    void testAcelerar() {
        // Ejecuto
        cut.acelerar(34);
        int velocidadFinal = cut.acelerar(23);

        // Verifico
        assertEquals(57, velocidadFinal);
    }

    @Test
    void testFrenar() {
        // Ejecuto
        cut.acelerar(50);
        cut.frenar(0);
        int velocidadFinal = cut.frenar(23);

        // Verifico
        assertEquals(27, velocidadFinal);
    }

    @Test
    void testGetConsumo() {
        cut.acelerar(50);
        double ConsumoActual = cut.getConsumo();
        assertEquals(2.15, ConsumoActual);

    }

    @Test
    void testGetVelocidad() {
        cut.acelerar(50);
        int velocidadFinal = cut.getVelocidad();
        assertEquals(50, velocidadFinal);
    }
}
