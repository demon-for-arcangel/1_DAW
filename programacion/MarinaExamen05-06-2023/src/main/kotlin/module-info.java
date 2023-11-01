module com.example.marinaexamen05062023 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.marinaexamen05062023 to javafx.fxml;
    exports com.example.marinaexamen05062023;
}