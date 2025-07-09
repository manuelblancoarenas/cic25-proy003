package es.cic.curso25;

public class Calculadora {
    private double total = 0.0d;
    private double totalMultiplicacionDivision = 1.0d;

    public double getTotal() {
        return total;
    }

    public double getTotalMultiplicacionDivision(){
        return totalMultiplicacionDivision;
    }

    public void sumar(double valor){
        total += valor;
    }

    public void restar(double valor) {
        total -= valor;
    }

    public void multiplicar(double valor) {
        totalMultiplicacionDivision = totalMultiplicacionDivision*valor;
    }

    public void dividir(double valor) {
        if (valor == 0)
            totalMultiplicacionDivision = Double.NaN;
        else
            totalMultiplicacionDivision = totalMultiplicacionDivision/valor;
    }
}
