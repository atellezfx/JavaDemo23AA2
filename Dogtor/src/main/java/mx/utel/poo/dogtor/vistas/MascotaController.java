package mx.utel.poo.dogtor.vistas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;

public class MascotaController {

    @FXML private Button btnAgregar;
    @FXML private Button btnEliminar;
    @FXML private Button btnGuardar;
    @FXML private ComboBox<?> cmpEspecie;
    @FXML private DatePicker cmpFecha;
    @FXML private ComboBox<?> cmpGenero;
    @FXML private TextField cmpNombre;
    @FXML private ComboBox<?> cmpTalla;
    @FXML private TableColumn<?, ?> colEspecie;
    @FXML private TableColumn<?, ?> colGenero;
    @FXML private TableColumn<?, ?> colNombre;
    @FXML private TableColumn<?, ?> colTalla;

    @FXML
    void agregarMascota(ActionEvent event) {

    }

    @FXML
    void eliminarMascota(ActionEvent event) {

    }

    @FXML
    void guardarMascota(ActionEvent event) {

    }

    @FXML
    void seleccionarMascota(MouseEvent event) {

    }

}