package mx.utel.poo.dogtor.util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public enum Especie {

    PERRO, GATO, AVE;

    public static ObservableList<Especie> observableList() {
        return FXCollections.observableArrayList( values() );
    }

}
