package com.example.examen220604

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Modality
import javafx.stage.Stage

class InicioController {
    @FXML
    private fun onbtnCrear() {
        val loader = FXMLLoader(javaClass.getResource("creacion-view.fxml"))
        val root = loader.load<Parent>()
        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.WINDOW_MODAL)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.showAndWait()
    }
}