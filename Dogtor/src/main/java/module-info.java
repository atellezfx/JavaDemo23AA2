module mx.utel.poo.dogtor {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.utel.poo.dogtor to javafx.fxml;
    exports mx.utel.poo.dogtor;
    exports mx.utel.poo.dogtor.views;
    opens mx.utel.poo.dogtor.views to javafx.fxml;
}