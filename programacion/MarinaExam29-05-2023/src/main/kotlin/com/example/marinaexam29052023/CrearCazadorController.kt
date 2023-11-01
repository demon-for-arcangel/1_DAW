package com.example.marinaexam29052023

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.TextField
import javafx.scene.control.Button
import javafx.stage.Stage
import java.net.URL
import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.SQLException
import java.util.*

class CrearCazadorController: Initializable {
    @FXML private lateinit var textNombre: TextField
    @FXML private lateinit var textApellido: TextField
    @FXML private lateinit var btnSalir: Button
    @FXML private lateinit var btnCrear: Button


    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        TODO("Not yet implemented")
    }

    @FXML
    private fun onbtnCrear(){
        try{
            val nombre = textNombre.text
            val apellido = textApellido.text

            val connection: Connection =
                    DriverManager.getConnection("jdbc:mysql:://localhost/zombie", "root", "")

            val query =
                    "INSERT INTO cazador (nombre, apellido) VALUES (?, ?)"

            val statement: PreparedStatement = connection.prepareStatement(query)

            statement.setString(1, nombre)
            statement.setString(2, apellido)

            statement.executeUpdate()

            connection.close()
        }catch(e: SQLException){
            e.printStackTrace()
        }
    }

    private fun onbtnSalir(){
        val primaryStage = (btnSalir.scene.window as Stage)
        val root = FXMLLoader.load<Parent>(javaClass.getResource("menu-view.fxml"))
        val scene = Scene(root)
        primaryStage.scene = scene
    }
}