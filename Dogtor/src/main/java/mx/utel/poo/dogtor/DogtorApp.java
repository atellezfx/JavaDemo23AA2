package mx.utel.poo.dogtor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mx.utel.poo.dogtor.vistas.MascotaController;

import java.io.IOException;

public class DogtorApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader( MascotaController.getView() );
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Gestión Veterinaria DogtorPet");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}