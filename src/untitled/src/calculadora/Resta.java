package calculadora;

public class Resta {

    private double acumulado;

    public Resta() {
        this.acumulado = 0;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public double restar(double a, double b, double c) {
        return a - b - c;
    }

    public double restarAcumulado(double a) {
        this.acumulado -= a;
        return this.acumulado;
    }
}
