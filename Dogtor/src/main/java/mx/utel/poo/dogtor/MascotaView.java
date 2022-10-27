package mx.utel.poo.dogtor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MascotaView {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}