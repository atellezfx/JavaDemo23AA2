module mx.utel.poo.dogtor {
    requires javafx.controls;
    requires javafx.fxml;
    // requires lombok;

    exports mx.utel.poo.dogtor;
    exports mx.utel.poo.dogtor.vistas;

    opens mx.utel.poo.dogtor.modelo to javafx.base;
    opens mx.utel.poo.dogtor.vistas to javafx.fxml;
}