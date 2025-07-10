package es.cic.curso25;

public class Coche {
    public final double CONSUMO_INSTANTANEO = 4.3;
    private int velocidad = 0;
    
    public int getVelocidad() {
        return velocidad;
    }

    public double getConsumo() {
        return velocidad / 100.0 * CONSUMO_INSTANTANEO;
        // otra opción: ((double)velocidad)/100 * CONSUMO_INSTANTANEO; <-- ESTO SE LLAMA CASTING
    }

    public int acelerar(int incrementoDeVelocidad) {
        this.velocidad += incrementoDeVelocidad;
        return this.velocidad;
    }

    public int frenar(int decrementoDeVelocidad) {
        this.velocidad -= decrementoDeVelocidad;
        return this.velocidad;
    }
}
