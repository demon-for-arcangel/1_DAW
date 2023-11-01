module com.example.examen220604 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.examen220604 to javafx.fxml;
    exports com.example.examen220604;
}