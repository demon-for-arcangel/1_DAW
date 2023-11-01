module com.example.marinaexam29052023 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;
    requires java.desktop;


    opens com.example.marinaexam29052023 to javafx.fxml;
    exports com.example.marinaexam29052023;
}