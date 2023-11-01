module com.example.interfaz_menus_bbdd_tabla {
    requires javafx.controls;
    requires javafx.fxml;
                requires kotlin.stdlib;
    
                            
    opens com.example.interfaz_menus_bbdd_tabla to javafx.fxml;
    exports com.example.interfaz_menus_bbdd_tabla;
}