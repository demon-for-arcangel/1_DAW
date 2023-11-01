module com.example.examen22052023 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.examen22052023 to javafx.fxml;
    exports com.example.examen22052023;
}