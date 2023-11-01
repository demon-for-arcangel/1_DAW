package com.example.seguimientoempresa

import BBDD.Usuario.Usuario
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.stage.Modality
import javafx.stage.Stage
import java.io.IOException
import java.net.URL
import java.sql.Connection
import java.sql.Driver
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement
import java.util.*

class PrincipalController: Initializable {
    @FXML private lateinit var textNumeroPersonal: TextField

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        // No se necesita ninguna lógica de inicialización en este caso
    }

    @FXML
    fun btnDarseAlta(){
        try {
            val loader = FXMLLoader(javaClass.getResource("alta-view.fxml"))
            val root = loader.load<javafx.scene.Parent>()
            val detailController = loader.getController<AltaController>()

            val stage = Stage()

            stage.scene = Scene(root)
            stage.initModality(Modality.APPLICATION_MODAL)
            stage.initModality(Modality.WINDOW_MODAL)
            //stage.show()
            stage.showAndWait()

        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    @FXML
    fun onbtnIniciarSesion(): Boolean{
        val numeroPersonal = textNumeroPersonal.text
        //Establecer la conexión a la base de datos
        val url="jdbc:mysql://localhost/emociones"
        val user = "root"
        val password = ""

        var connection: Connection? = null
        var statement: Statement? = null
        var resultSet: ResultSet? = null

        try{
            val loader = FXMLLoader(javaClass.getResource("menu-view.fxml"))
            val root = loader.load<javafx.scene.Parent>()
            val detailController = loader.getController<MenuController>()

            val stage = Stage()

            stage.scene = Scene(root)
            stage.initModality(Modality.APPLICATION_MODAL)
            stage.initModality(Modality.WINDOW_MODAL)
            //stage.show()
            stage.showAndWait()

            //Verificar si se encontró algún resultado
            if (resultSet.next()){
                //El número personal existe en la tabla de usuarios
                //Redireccionar a la siguiente página
                try {
                    val loader = FXMLLoader(javaClass.getResource("menu-view.fxml"))
                    val root = loader.load<javafx.scene.Parent>()
                    val detailController = loader.getController<MenuController>()

                    val stage = Stage()

                    stage.scene = Scene(root)
                    stage.initModality(Modality.APPLICATION_MODAL)
                    stage.initModality(Modality.WINDOW_MODAL)
                    //stage.show()
                    stage.showAndWait()
                }catch(e: Exception){
                    e.printStackTrace()
                }
                return true
            }else{
                //El número personal no existe en la tabla de usuarios
                //Mostrar un mensaje de error
                return false
            }
        }catch(e: SQLException){
            e.printStackTrace()
            //Manejar la excepción en caso de error en la bbdd
        }finally{
            //Cerrar la conexión y liberar los recursos
            resultSet?.close()
            statement?.close()
            connection?.close()
        }
        return false
    }
}