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

    @Disabled
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

    }

    @Test
    void testGetConsumo() {

    }

    @Test
    void testGetVelocidad() {

    }
}
