package calculadora;

public class Main {
    public static void main(String[] args) {
//Suma
        Suma suma = new Suma();

        System.out.println("Suma de 5.5 y 3.2: " + suma.sumar(5.5, 3.2));
        System.out.println("Suma de 5 y 3: " + suma.sumar(5, 3));
        System.out.println("Suma de 2.1, 3.5 y 4.8: " + suma.sumar(2.1, 3.5, 4.8));
        System.out.println("Suma acumulada de 10: " + suma.sumarAcumulado(10));
        System.out.println("Suma acumulada de 5: " + suma.sumarAcumulado(5));
//Resta
        Resta resta = new Resta();

        System.out.println("Resta de 10.5 y 4.2: " + resta.restar(10.5, 4.2));
        System.out.println("Resta de 10 y 3: " + resta.restar(10, 3));
        System.out.println("Resta de 20.0, 5.5 y 3.2: " + resta.restar(20.0, 5.5, 3.2));
        System.out.println("Resta acumulada de 10: " + resta.restarAcumulado(10));
        System.out.println("Resta acumulada de 5: " + resta.restarAcumulado(5));

// Producto
        Producto producto = new Producto();

        System.out.println("Producto de 4.5 y 2.0: " + producto.multiplicar(4.5, 2.0));
        System.out.println("Producto de 4 y 2: " + producto.multiplicar(4, 2));
        System.out.println("Producto de 2.0, 3.0 y 4.0: " + producto.multiplicar(2.0, 3.0, 4.0));
        System.out.println("Potencia de 2^3: " + producto.potencia(2, 3));
        System.out.println("Potencia de 5^2: " + producto.potencia(5, 2));
// Cociente
        Cociente cociente = new Cociente();

        System.out.println("División de 10.0 entre 2.0: " + cociente.dividir(10.0, 2.0));
        System.out.println("División de 10 entre 2: " + cociente.dividir(10, 2));
        System.out.println("Raíz cuadrada de 16: " + cociente.raiz(16));
        System.out.println("Raíz cuadrada de 25: " + cociente.raiz(25));

    }
}



