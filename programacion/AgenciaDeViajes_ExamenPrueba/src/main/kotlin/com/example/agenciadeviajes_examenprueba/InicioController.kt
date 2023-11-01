package com.example.agenciadeviajes_examenprueba

import BBDD.Constantes
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextInputDialog

class InicioController {
    @FXML private lateinit var lblNombre: Label

    @FXML
    private fun CrearFichero(){
        val dialog = TextInputDialog()
        dialog.title = "Fichero"
        dialog.headerText = null
        dialog.contentText = "Nombre:"
        val result = dialog.showAndWait()
        var nombre = Constantes.FicheroUsuario
        if (result.isPresent){}
    }
}