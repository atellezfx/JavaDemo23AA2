package mx.utel.poo.fundamentos;

public class ProgramaLogico {

    public static void main(String[] args) {
        Operaciones oper = new Operaciones();

        // Operadores lógicos regulares
//        boolean resultado = oper.esFalso() | oper.esVerdadero() | oper.esVerdadero();
//        System.out.println("El resultado fue " + resultado);

        // Operadores lógicos de corto circuito || y &&
        boolean resultado = oper.esFalso() && oper.esVerdadero() && oper.esVerdadero();
        System.out.println("El resultado fue " + resultado);
    }

}
