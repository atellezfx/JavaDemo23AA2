package mx.utel.poo.dogtor.vistas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import mx.utel.poo.dogtor.modelo.Mascota;
import mx.utel.poo.dogtor.util.Especie;
import mx.utel.poo.dogtor.util.Genero;
import mx.utel.poo.dogtor.util.Talla;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MascotaController implements Initializable {

    @FXML private Button btnAgregar;
    @FXML private Button btnEliminar;
    @FXML private Button btnGuardar;
    @FXML private ComboBox<Especie> cmpEspecie;
    @FXML private DatePicker cmpFecha;
    @FXML private ComboBox<Genero> cmpGenero;
    @FXML private TextField cmpNombre;
    @FXML private ComboBox<Talla> cmpTalla;
    @FXML private TableView<Mascota> tablaMascotas;
    @FXML private TableColumn<Mascota, Especie> colEspecie;
    @FXML private TableColumn<Mascota, Genero> colGenero;
    @FXML private TableColumn<Mascota, String> colNombre;
    @FXML private TableColumn<Mascota, Talla> colTalla;

    private ObservableList<Mascota> mascotas = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tablaMascotas.setItems( mascotas );
        colNombre.setCellValueFactory( new PropertyValueFactory("nombre") );
        colEspecie.setCellValueFactory( new PropertyValueFactory("especie") );
        colGenero.setCellValueFactory( new PropertyValueFactory("genero") );
        colTalla.setCellValueFactory( new PropertyValueFactory("talla") );
        cmpEspecie.setItems( Especie.observableList() );
        cmpGenero.setItems( Genero.observableList() );
        cmpTalla.setItems( Talla.observableList() );
    }

    @FXML
    void agregar(ActionEvent event) {
        Mascota m = crearMascota();
        mascotas.add(m);
        limpiar();
    }

    @FXML
    void eliminar(ActionEvent event) {

    }

    @FXML
    void guardar(ActionEvent event) {

    }

    @FXML
    void seleccionar(MouseEvent event) {

    }

    private Mascota crearMascota() {
        String nombre = cmpNombre.getText();
        Especie especie = cmpEspecie.getValue();
        Talla talla = cmpTalla.getValue();
        Genero genero = cmpGenero.getValue();
        LocalDate fechaNac = cmpFecha.getValue();
        return new Mascota(nombre, especie,genero, talla, fechaNac);
    }

    private void limpiar() {
        cmpNombre.setText(null);
        cmpEspecie.setValue(null);
        cmpTalla.setValue(null);
        cmpGenero.setValue(null);
        cmpFecha.setValue(null);
        tablaMascotas.getSelectionModel().clearSelection();
    }

    public static URL getView(){
        return MascotaController.class.getResource("mascota-view.fxml");
    }

}