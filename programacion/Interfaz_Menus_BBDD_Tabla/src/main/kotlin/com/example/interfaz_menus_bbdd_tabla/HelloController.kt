package com.example.interfaz_menus_bbdd_tabla

import javafx.fxml.FXML
import javafx.scene.control.Label

class HelloController {
    @FXML private lateinit var welcomeText: Label
    // @FXML private lateinit var

    @FXML
    private fun RellenarTabla() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }
}