package com.example.marinaexam29052023

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.stage.Modality
import javafx.stage.Stage

class MenuController {
    @FXML private lateinit var btnCrearCazador: Button
    @FXML private lateinit var btnCrearZombie: Button

    @FXML
    private fun onbtnCrearCazador() {
        val loader = FXMLLoader(javaClass.getResource("CrearCazador-view.fxml"))
        val root: Parent = loader.load()

        val controller = loader.getController<CrearCazadorController>()

        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.initModality(Modality.WINDOW_MODAL)
        stage.show()
    }

    @FXML
    private fun onbtnCrearZombie() {

    }

    @FXML
    private fun onbtnConsultarZombies(){
        val loader = FXMLLoader(javaClass.getResource("ConsultarZombies-view.fxml"))
        val root: Parent = loader.load()

        val controller = loader.getController<ConsultarZombiesController>()

        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.initModality(Modality.WINDOW_MODAL)
        stage.show()
    }
}