package com.example.demo1

import javafx.fxml.FXML
import javafx.scene.control.Label

class HelloController {
    @FXML
    private lateinit var welcomeText: Label

    var p = 0
    @FXML
    private fun onHelloButtonClick() {
        if (p == 0){
            welcomeText.text = "Welcome to JavaFX Application!"
            p = 1
        } else {
            welcomeText.text = "Franciscoooooo"
            p = 0
        }
    }
}