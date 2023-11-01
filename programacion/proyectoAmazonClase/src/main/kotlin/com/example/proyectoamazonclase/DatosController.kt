package com.example.proyectoamazonclase

import BBDD.Constantes
import BBDD.Objetos.Objetos
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.stage.Modality
import javafx.stage.Stage
import java.lang.Exception
import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.SQLException

class DatosController {
    var objeto = Objetos()

    @FXML private lateinit var lblId: Label
    @FXML private lateinit var txtNombre: TextField
    @FXML private lateinit var txtPeso: TextField
    @FXML private lateinit var txtPeligroso: TextField

    fun inicializar(){
        lblId.text = objeto.id.toString()
        txtNombre.text = objeto.nombre
        txtPeso.text = objeto.peso.toString()
        txtPeligroso.text = objeto.peligroso.toString()
    }

    @FXML
    fun onbtnGuardar() {
        try{
            val nombre = txtNombre.text
            val peso = txtPeso.text.toInt()
            val peligroso = txtPeligroso.text.toBoolean()
            val id = lblId.text.toInt()

            val connection: Connection =
                DriverManager.getConnection("jdbc:mysql://localhost/amazon", "root", "")

            val query = Constantes.objetosSQL3

            val statement: PreparedStatement = connection.prepareStatement(query)

            statement.setString(1, nombre)
            statement.setInt(2, peso)
            statement.setBoolean(3, peligroso)
            statement.setInt(4, id)

            statement.executeUpdate()

            try{
                val loader = FXMLLoader(javaClass.getResource("tabla-view.fxml"))
                val root = loader.load<Parent>()
                val detailController = loader.getController<TablaController>()

                val stage = Stage()

                //stage.scene = Scene(root)
                stage.initModality(Modality.APPLICATION_MODAL)
                stage.initModality(Modality.WINDOW_MODAL)
                stage.show()
            }catch(e: Exception){
                e.printStackTrace()
            }
        }catch(e: SQLException){
            println(e.message)
        }
    }
}