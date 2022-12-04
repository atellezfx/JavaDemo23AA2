package mx.utel.poo.dogtor.util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *  Diferencia Talla chica y mediana es de 5 años
 *  Diferencia Talla grande es de 6 años
 *  Diferencia Talla extra grande es de 7 años
 */
public enum Talla {

    CHICA(5), MEDIANA(5), GRANDE(6), EXTRA_GRANDE(7);

    private int diferencia;

    private Talla(int diferencia) {
        this.diferencia = diferencia;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public static ObservableList<Talla> observableList() {
        return FXCollections.observableArrayList( values() );
    }

    @Override
    public String toString() {
        return name().replace('_', ' ');
    }
}