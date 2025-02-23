package calculadora;

public class Resta {

    private double acumulado;

    /**
     * Constructor de la clase Resta.
     */
    public Resta() {
        this.acumulado = 0;
    }

    /**
     * Resta dos números reales.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Resta dos números enteros.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Resta tres números reales.
     */
    public double restar(double a, double b, double c) {
        return a - b - c;
    }

    /**
     * Resta un número al valor acumulado.
     */
    public double restarAcumulado(double a) {
        this.acumulado -= a;
        return this.acumulado;
    }
}
