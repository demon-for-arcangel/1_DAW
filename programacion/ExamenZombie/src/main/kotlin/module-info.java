module com.example.examenzombie {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.examenzombie to javafx.fxml;
    exports com.example.examenzombie;
}