module com.example.agenciadeviajes_examenprueba {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.agenciadeviajes_examenprueba to javafx.fxml;
    exports com.example.agenciadeviajes_examenprueba;
}