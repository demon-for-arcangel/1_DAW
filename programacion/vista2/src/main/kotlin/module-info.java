module com.example.vista2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.vista2 to javafx.fxml;
    exports com.example.vista2;
}