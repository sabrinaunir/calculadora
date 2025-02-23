package calculadora;

public class Producto {

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b, double c) {
        return a * b * c;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}
