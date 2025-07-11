package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class PruebasTest {

    @Test
    public void lanzame() {
        boolean valor = true;
        char letra = 'e';
        char nuevaLetra = "a".charAt(0);

        Coche miCoche = new Coche();
        Object miCoche2 = miCoche;

        Camion miCamioncito = new Camion();

        miCamioncito.meterCarga();

        GruaDelPuerto teodoro = new GruaDelPuerto();
        Object referencia = teodoro;
        referencia.toString();
        referencia = miCamioncito;
        referencia.toString();

        ((GruaDelPuerto)referencia).meterCarga(); // esto estalla, porque a miCamioncito también se refiere ahora referencia. Esto es,
                                                  // referencia es un camión. Y yo no puedo convertir camión a grúa.
    }
    
    //   EJEMPLO DE POLIMORFISMO
    //public void acelerarRemotamente(Coche coche, int incremento) {
    //    coche.acelerar(incremento);
    //}
    //
    //public void acelerarRemotamente(Camion camion, int incremento) {
    //    camion.acelerar(incremento);
    //}

    public void acelerarRemotamente(Vehiculo vehiculo, int incremento) {
        vehiculo.acelerar(incremento);
    }
    
}
