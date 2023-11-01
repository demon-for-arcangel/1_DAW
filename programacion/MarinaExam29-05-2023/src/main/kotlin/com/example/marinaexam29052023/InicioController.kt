package com.example.marinaexam29052023

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.stage.Modality
import javafx.stage.Stage

class InicioController {
    @FXML private lateinit var btnJugar: Button

    @FXML
    private fun onbtnJugar() {
        val loader = FXMLLoader(javaClass.getResource("menu-view.fxml"))
        val root: Parent = loader.load()

        val controller = loader.getController<MenuController>()

        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.initModality(Modality.WINDOW_MODAL)
        stage.show()
    }
}