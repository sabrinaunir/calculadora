package calculadora;

public class Suma {

    private double acumulado;

    /**
     * Constructor de la clase Suma.
     */
    public Suma() {
        this.acumulado = 0;
    }

    /**
     * Suma dos números reales.
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Suma dos números enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Suma tres números reales.
     */
    public double sumar(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * Suma un número al valor acumulado.
     */
    public double sumarAcumulado(double a) {
        this.acumulado += a;
        return this.acumulado;
    }
}
