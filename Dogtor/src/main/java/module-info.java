module mx.utel.poo.dogtor {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.utel.poo.dogtor to javafx.fxml;
    exports mx.utel.poo.dogtor;
}