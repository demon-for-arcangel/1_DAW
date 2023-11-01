package com.example.examen22052023

import BBDD.Destinos.Destino
import BBDD.Usuario.Usuario
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.scene.control.ComboBox
import javafx.stage.Modality
import javafx.stage.Stage
import java.net.URL
import java.util.*
import kotlin.collections.ArrayList

class NuevoController: Initializable {
    @FXML private lateinit var comboBoxUsuario: ComboBox<Usuario>
    @FXML private lateinit var obsLista1: ObservableList<Usuario>

    @FXML private lateinit var comboBoxDestino: ComboBox<Destino>
    @FXML private lateinit var obsLista2: ObservableList<Destino>

    override fun initialize(p0: URL?, p1: ResourceBundle?) {

    }

    @FXML
    fun onbtnAceptar(){

    }
}