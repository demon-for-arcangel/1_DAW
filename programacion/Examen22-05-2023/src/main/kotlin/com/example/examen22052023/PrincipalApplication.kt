//Marina Laguna Valdepeñas 1ºDAW
package com.example.examen22052023

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class PrincipalApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(PrincipalApplication::class.java.getResource("principal-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 620.0, 400.0)
        stage.title = "Principal"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(PrincipalApplication::class.java)
}