module com.example.tabla_bbdd_persona {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.tabla_bbdd_persona to javafx.fxml;
    exports com.example.tabla_bbdd_persona;
}