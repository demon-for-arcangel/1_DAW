module com.example.calculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.calculadora to javafx.fxml;
    exports com.example.calculadora;
}