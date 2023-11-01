package com.example.examen22052023

import FicheroSerializable.Serializable
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.text.Text
import javafx.stage.Modality
import javafx.stage.Stage
import java.io.IOException
import java.io.Serializable
import java.net.URL
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.util.*

class PrincipalController: Initializable {

    @FXML private lateinit var Usuario: Menu
    @FXML private lateinit var CrearFichero: MenuItem
    @FXML private lateinit var InsertarBBDD: MenuItem
    @FXML private lateinit var Ciudades: Menu
    @FXML private lateinit var CrearFichero2: MenuItem
    @FXML private lateinit var InsertarBBDD2: MenuItem
    @FXML private lateinit var Viaje: Menu
    @FXML private lateinit var Tabla: MenuItem
    @FXML private lateinit var Nuevo: MenuItem

    override fun initialize(p0: URL?, p1: ResourceBundle?) {

    }

    @FXML
    fun onCrearFicheroPulsado() {
        try{
            val alert = Alert(Alert.AlertType.CONFIRMATION)

            alert.title = "Fichero"
            alert.headerText = "Nombre: "

            val buttonTypeAceptar = ButtonType("Aceptar")
            val buttonTypeCancel = ButtonType.CANCEL
            alert.buttonTypes.setAll(buttonTypeAceptar, buttonTypeCancel)

            val result = alert.showAndWait()
            if (result.get() == buttonTypeAceptar) {
                println("Button One clicked")
                var fichero = Serializable()
            } else {
                println("Dialog canceled")
            }
        }catch(e: IOException){
            e.printStackTrace()
        }
    }

    @FXML
    fun onInsertarBBDDPulsado(){
        try{
            val alert = Alert(Alert.AlertType.INFORMATION)

            alert.title = "Información"
            alert.headerText = "ACTUALIZACIÓN BASE DE DATOS "
            alert.contentText = "Usuarios guardados"

            val buttonTypeAceptar = ButtonType("Aceptar")
            alert.buttonTypes.setAll(buttonTypeAceptar)

            val result = alert.showAndWait()
            if (result.get() == buttonTypeAceptar) {
                println("Button One clicked")
            }
        }catch(e: IOException){
            e.printStackTrace()
        }
    }

    @FXML
    fun onTablaPulsado(){
        //Establecer la conexión a la base de datos
        val url="jdbc:mysql://localhost/emociones"
        val user = "root"
        val password = ""

        var connection: Connection? = null
        var statement: Statement? = null
        var resultSet: ResultSet? = null

        try {
            val loader = FXMLLoader(javaClass.getResource("tabla-view.fxml"))
            val root = loader.load<javafx.scene.Parent>()
            val detailController = loader.getController<TablaController>()

            val stage = Stage()

            stage.scene = Scene(root)
            stage.initModality(Modality.APPLICATION_MODAL)
            stage.initModality(Modality.WINDOW_MODAL)
            //stage.show()
            stage.showAndWait()
        }catch(e: Exception){
            e.printStackTrace()
        }
    }

    @FXML
    fun onNuevoPulsado(){
        try {
            val loader = FXMLLoader(javaClass.getResource("nuevo-view.fxml"))
            val root = loader.load<javafx.scene.Parent>()
            val detailController = loader.getController<NuevoController>()

            val stage = Stage()

            stage.scene = Scene(root)
            stage.initModality(Modality.APPLICATION_MODAL)
            stage.initModality(Modality.WINDOW_MODAL)
            //stage.show()
            stage.showAndWait()
        }catch(e: Exception){
            e.printStackTrace()
        }
    }
}