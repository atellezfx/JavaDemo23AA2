package mx.utel.poo.evaluacion2;

import java.util.stream.IntStream;

public class NumerosPrimosFunc {

    public static void main(String[] args) {
        NumerosPrimosFunc prog = new NumerosPrimosFunc();
        System.out.println("Los números primos entre 1 y 16 son: ");
        IntStream.rangeClosed(1,16).filter( prog::esPrimo ).forEach( System.out::println );
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
