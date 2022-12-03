package mx.utel.poo.dogtor.vistas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import mx.utel.poo.dogtor.modelo.Mascota;
import mx.utel.poo.dogtor.util.Especie;
import mx.utel.poo.dogtor.util.Genero;
import mx.utel.poo.dogtor.util.Talla;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MascotaController implements Initializable {

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

    private final ObservableList<Mascota> mascotas = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tablaMascotas.setItems( mascotas );
        colNombre.setCellValueFactory( new PropertyValueFactory<>("nombre") );
        colEspecie.setCellValueFactory( new PropertyValueFactory<>("especie") );
        colGenero.setCellValueFactory( new PropertyValueFactory<>("genero") );
        colTalla.setCellValueFactory( new PropertyValueFactory<>("talla") );
        cmpEspecie.setItems( Especie.observableList() );
        cmpGenero.setItems( Genero.observableList() );
        cmpTalla.setItems( Talla.observableList() );
    }

    @FXML
    private void agregar() {
        Mascota m = crearMascota();
        mascotas.add(m);
        limpiar();
    }

    @FXML
    private void eliminar() {
        Mascota m = tablaMascotas.getSelectionModel().getSelectedItem();
        mascotas.remove(m);
        limpiar();
    }

    @FXML
    private void guardar() {
        int seleccionado = tablaMascotas.getSelectionModel().getSelectedIndex();
        Mascota m = mascotas.get( seleccionado );
        m.setNombre( cmpNombre.getText() );
        m.setEspecie( cmpEspecie.getValue() );
        m.setTalla( cmpTalla.getValue() );
        m.setGenero( cmpGenero.getValue() );
        m.setFechaNac( cmpFecha.getValue() );
        mascotas.set(seleccionado, m);
        limpiar();
    }

    @FXML
    private void seleccionar() {
        Mascota m = tablaMascotas.getSelectionModel().getSelectedItem();
        cmpNombre.setText(m.getNombre());
        cmpEspecie.setValue(m.getEspecie());
        cmpTalla.setValue(m.getTalla());
        cmpGenero.setValue(m.getGenero());
        cmpFecha.setValue(m.getFechaNac());
    }

    private Mascota crearMascota() {
        String nombre = cmpNombre.getText();
        Especie especie = cmpEspecie.getValue();
        Talla talla = cmpTalla.getValue();
        Genero genero = cmpGenero.getValue();
        LocalDate fechaNac = cmpFecha.getValue();
        return new Mascota(nombre, especie,genero, talla, fechaNac);
    }

    @FXML
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