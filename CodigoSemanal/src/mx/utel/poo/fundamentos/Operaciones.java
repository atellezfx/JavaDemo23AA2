package mx.utel.poo.fundamentos;

/**
 * Clase de demostración de operaciones matemáticas y lógicas
 */
public class Operaciones {

    /**
     * Este método realiza la suma de dos valores enteros
     * @param x El primer número entero a sumar
     * @param y El segundo número entero a sumar
     * @return El resultado de la suma
     */
    public int suma(int x, int y) {
        return x + y;
    }

    /**
     * Este método realiza la resta de dos valores enteros
     * @param x El primer número entero a restar
     * @param y El segundo número entero a restar
     * @return El resultado de la resta
     */
    public int resta(int x, int y) {
        return x - y;
    }

    /**
     * Este método realiza la multiplica de dos valores enteros
     * @param x El primer número entero a multiplicar
     * @param y El segundo número entero a multiplicar
     * @return El resultado de la multiplica
     */
    public int multiplica(int x, int y) {
        return x * y;
    }

    /**
     * Este método realiza la división de dos valores enteros
     * @param x El primer número entero a dividir
     * @param y El segundo número entero a dividir
     * @return El resultado de la división
     */
    public int division(int x, int y) {
        if( y != 0 ) return x / y;
        System.out.println(">>>>> No es posible dividir entre 0!!!");
        return 0;
    }

    /**
     * Este método siempre regresa verdadero
     * @return El valor verdadero
     */
    public boolean esVerdadero() {
        System.out.println("Este método siempre regresa verdadero");
        return true;
    }

    /**
     * Este método siempre regresa falso
     * @return El valor falso
     */
    public boolean esFalso() {
        System.out.println("Este método siempre regresa falso");
        return false;
    }

}
