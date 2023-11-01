module com.example.supermercado {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.supermercado to javafx.fxml;
    exports com.example.supermercado;
}