module vista.vista1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens vista.vista1 to javafx.fxml;
    exports vista.vista1;
}