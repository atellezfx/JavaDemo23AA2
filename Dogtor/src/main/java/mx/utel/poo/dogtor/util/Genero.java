package mx.utel.poo.dogtor.util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public enum Genero {
    HEMBRA, MACHO;

    public static ObservableList<Genero> observableList() {
        return FXCollections.observableArrayList( values() );
    }
}
