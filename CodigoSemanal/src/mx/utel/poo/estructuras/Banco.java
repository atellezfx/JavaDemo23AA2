package mx.utel.poo.estructuras;

import java.util.Optional;

public record Banco(String nombre) {

    public Optional<Credito> solicitarCredito(Cliente cli, float monto ) {
        var optr = cli.rango();
        if(optr.isPresent() ) {
            var credito = autorizarCredito( monto, optr.get() );
            return Optional.of(credito);
        }
        return Optional.empty();
    }

    private Credito autorizarCredito( float monto, RangoEdad rango ) {
        // ########### ESTRUCTURA SWITCH ###################
//        Credito cred = null;
//        switch( rango ) {
//            case JOVEN:
//                cred = new Credito(monto, 0.15f);
//                break;
//            case ADULTO:
//                cred = new Credito(monto, 0.12f);
//                break;
//            case SENIOR:
//                cred = new Credito(monto, 0.10f);
//                break;
//        }
//        return cred;
        // ########### EXPRESIÓN SWITCH ###################
        return switch( rango ) {
            case JOVEN -> new Credito(monto, 0.15f);
            case ADULTO -> new Credito(monto, 0.12f);
            case SENIOR -> new Credito(monto, 0.10f);
        };
    }

    private boolean sujetoDeCredito( Cliente cli ) {
        return cli.edad() >= 18 && cli.edad() <= 80;
    }


    @Override
    public String toString() {
        return nombre;
    }
}
