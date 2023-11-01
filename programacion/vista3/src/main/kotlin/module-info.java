module com.example.vista3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.vista3 to javafx.fxml;
    exports com.example.vista3;
}