package calculadora;

public class Suma {

    private double acumulado;

    public Suma() {
        this.acumulado = 0;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b, double c) {
        return a + b + c;
    }

    public double sumarAcumulado(double a) {
        this.acumulado += a;
        return this.acumulado;
    }
}
