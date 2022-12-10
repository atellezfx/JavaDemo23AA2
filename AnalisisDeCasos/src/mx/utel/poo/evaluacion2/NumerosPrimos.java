package mx.utel.poo.evaluacion2;

public class NumerosPrimos {

    public static void main(String[] args) {
        NumerosPrimos prog = new NumerosPrimos();
//        int numero = 6;
//        boolean result1 = prog.esPrimo(numero);
//        System.out.printf("El número %d es primo? %b \n", numero, result1);

        int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        for( int num : numeros ) {
            boolean result2 = prog.esPrimo(num);
            System.out.printf("El número %d es primo? %b \n", num, result2);
        }

    }

    public boolean esPrimo(int num) {
        if( num <= 1 ) return false;
        int numDiv = 0;
        for ( int i = num; i > 0; i-- ) {
            if( num % i == 0 ) numDiv++;
        }
        return numDiv == 2;
    }

}
