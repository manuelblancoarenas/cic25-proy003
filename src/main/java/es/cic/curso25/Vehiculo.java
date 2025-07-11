package es.cic.curso25;

import static java.lang.Math.round;

public class Vehiculo {
    protected Calculadora calculadora; // = new Calculadora(); si hiciésemos esta línea entera, no haría falta el constructor
    protected int velocidad = 0;
    public final double CONSUMO_INSTANTANEO = 4.3;

    public Vehiculo() {
        this.calculadora = new Calculadora(); //construyo la calculadora cuando construyo el coche. El "this" hace referencia a que lo que
                                              // se está modificando 
    }
    public int acelerar(int incrementoDeVelocidad) {
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.sumar(incrementoDeVelocidad);
        
        this.velocidad = (int) round(calculadora.getTotal());
        return this.velocidad;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public double getConsumo() {
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.dividir(100.0);
        this.calculadora.multiplicar(CONSUMO_INSTANTANEO);
        return calculadora.getTotal();
        // otra opción: ((double)velocidad)/100 * CONSUMO_INSTANTANEO; <-- ESTO SE LLAMA CASTING
    }

    public int frenar(int decrementoDeVelocidad) {
        this.calculadora.limpiar();
        this.calculadora.restar(this.velocidad);
        this.calculadora.restar(decrementoDeVelocidad);
        
        this.velocidad = (int) round(calculadora.getTotal());
        return this.velocidad;
    }
}
