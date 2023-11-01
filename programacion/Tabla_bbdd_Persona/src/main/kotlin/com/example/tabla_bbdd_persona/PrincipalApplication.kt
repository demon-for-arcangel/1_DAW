package com.example.tabla_bbdd_persona

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("Alumnado-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 622.0,334.0)
        stage.title = "Tabla"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}