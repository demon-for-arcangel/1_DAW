module com.example.demo9tablas {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.demo9tablas to javafx.fxml;
    exports com.example.demo9tablas;
}