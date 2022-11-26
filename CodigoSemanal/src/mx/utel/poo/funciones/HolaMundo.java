package mx.utel.poo.funciones;

import java.util.stream.Stream;

public class HolaMundo {

    public static void main(String[] args) {
        Stream.of("Hola ", "Mundo!!!").map(String::toUpperCase).filter(str -> str.startsWith("H"))
                .forEach(System.out::print);
    }

}
