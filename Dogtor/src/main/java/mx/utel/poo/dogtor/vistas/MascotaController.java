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
import java.time.Period;
import java.util.ResourceBundle;

public class MascotaController implements Initializable {

    @FXML private ComboBox<Especie> cmpEspecie;
    @FXML private DatePicker cmpFecha;
    @FXML private ComboBox<Genero> cmpGenero;
    @FXML private TextField cmpNombre;
    @FXML private TextField cmpEdad;
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
        if( m != null ) mascotas.remove(m);
        limpiar();
    }

    @FXML
    private void guardar() {
        Mascota m = tablaMascotas.getSelectionModel().getSelectedItem();
        if( m != null ) {
            m.setNombre( cmpNombre.getText() );
            m.setEspecie( cmpEspecie.getValue() );
            m.setGenero( cmpGenero.getValue() );
            m.setTalla( cmpTalla.getValue() );
            m.setFechaNac( cmpFecha.getValue() );
        }
        tablaMascotas.refresh();
        limpiar();
    }

    @FXML
    private void seleccionar() {
        Mascota m = tablaMascotas.getSelectionModel().getSelectedItem();
        if( m != null ) {
            cmpNombre.setText( m.getNombre() );
            cmpEspecie.setValue( m.getEspecie() );
            cmpGenero.setValue( m.getGenero() );
            cmpTalla.setValue( m.getTalla() );
            cmpFecha.setValue( m.getFechaNac() );
            cmpEdad.setText( String.valueOf(m.edad()) );
        }
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
        cmpEdad.setText(null);
        tablaMascotas.getSelectionModel().clearSelection();
    }

    @FXML
    private void mostrarEdad() {
        LocalDate fechaNac = cmpFecha.getValue();
        if( fechaNac != null ) {
            Period per = Period.between( cmpFecha.getValue(), LocalDate.now() );
            cmpEdad.setText( String.valueOf( per.getYears() ) );
        }
    }

    public static URL getView(){
        return MascotaController.class.getResource("mascota-view.fxml");
    }

}