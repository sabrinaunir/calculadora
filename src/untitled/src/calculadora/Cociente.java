package calculadora;

public class Cociente {

    /**
     * Divide dos números reales.
     *
     * Casos especiales:
     * - Si el divisor es 0, devuelve 0 para evitar errores de división por cero.
     * - Si la división no es exacta, devuelve un número decimal.
     *
     * @param a Dividendo.
     * @param b Divisor.
     * @return Resultado de la división o 0 si b es 0.
     */
    public double dividir(double a, double b) {
        return b != 0 ? a / b : 0;
    }

    /**
     * Divide dos números enteros.
     *
     * Casos especiales:
     * - Si el divisor es 0, devuelve 0.
     * - Si la división no es exacta, devuelve solo la parte entera del resultado.
     *
     * @param a Dividendo.
     * @param b Divisor.
     * @return Resultado de la división o 0 si b es 0.
     */
    public int dividir(int a, int b) {
        return b != 0 ? a / b : 0;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     *
     * Casos especiales:
     * - Si el número es negativo, devuelve 0 ya que no se pueden calcular raíces negativas en esta implementación.
     *
     * @param a Número del cual se quiere obtener la raíz.
     * @return La raíz cuadrada del número o 0 si es negativo.
     */
    public double raiz(double a) {
        return a >= 0 ? Math.sqrt(a) : 0;
    }
}
