module com.example.seguimientoempresa {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.seguimientoempresa to javafx.fxml;
    exports com.example.seguimientoempresa;
}