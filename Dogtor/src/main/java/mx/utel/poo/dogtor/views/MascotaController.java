package mx.utel.poo.dogtor.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;

public class MascotaController {
    @FXML
    private Label welcomeText;

    public static URL getView(){
        return MascotaController.class.getResource("mascota-view.fxml");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}