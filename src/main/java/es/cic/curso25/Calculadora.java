package es.cic.curso25;

public class Calculadora {
    private double total = 0.0d;

    public double getTotal() {
        return total;
    }

    public void sumar(double valor){
        total += valor;
    }

    public void restar(double valor) {
        total -= valor;
    }


}
