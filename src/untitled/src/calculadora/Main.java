package calculadora;

public class Main {
    public static void main(String[] args) {
        Suma suma = new Suma();

        System.out.println("Suma de 5.5 y 3.2: " + suma.sumar(5.5, 3.2));
        System.out.println("Suma de 5 y 3: " + suma.sumar(5, 3));
        System.out.println("Suma de 2.1, 3.5 y 4.8: " + suma.sumar(2.1, 3.5, 4.8));
        System.out.println("Suma acumulada de 10: " + suma.sumarAcumulado(10));
        System.out.println("Suma acumulada de 5: " + suma.sumarAcumulado(5));
    }
}
