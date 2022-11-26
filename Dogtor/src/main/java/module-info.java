module mx.utel.poo.dogtor {
    requires javafx.controls;
    requires javafx.fxml;
    // requires lombok;

    opens mx.utel.poo.dogtor to javafx.fxml;
    opens mx.utel.poo.dogtor.modelo to javafx.base;
    exports mx.utel.poo.dogtor;
    exports mx.utel.poo.dogtor.vistas;
    opens mx.utel.poo.dogtor.vistas to javafx.fxml;
}