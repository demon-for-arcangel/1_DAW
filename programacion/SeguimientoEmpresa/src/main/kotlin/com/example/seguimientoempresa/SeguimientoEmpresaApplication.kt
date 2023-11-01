package com.example.seguimientoempresa

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class SeguimientoEmpresaApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(SeguimientoEmpresaApplication::class.java.getResource("principal-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 600.0, 400.0)
        stage.title = "Seguimiento Empresa"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(SeguimientoEmpresaApplication::class.java)
}