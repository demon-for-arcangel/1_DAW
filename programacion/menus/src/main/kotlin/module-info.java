module com.example.menus {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.menus to javafx.fxml;
    exports com.example.menus;
}