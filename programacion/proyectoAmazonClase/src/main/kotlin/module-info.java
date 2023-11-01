module com.example.proyectoamazonclase {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;
    requires java.desktop;


    opens com.example.proyectoamazonclase to javafx.fxml;
    exports com.example.proyectoamazonclase;
}