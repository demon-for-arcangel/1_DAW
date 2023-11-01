package com.example.supermercado

import BBDD.Constantes
import BBDD.Productos.Productos
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.stage.Stage
import java.net.URL
import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.SQLException
import java.util.*

class HelloController {
    @FXML private lateinit var txtNombre: TextField
    @FXML private lateinit var txtCodProd: TextField
    @FXML private lateinit var txtCodCat: TextField
    @FXML private lateinit var txtCantidad: TextField
    @FXML private lateinit var txtPrecio: TextField
    @FXML private lateinit var btnInsertar: Button

    @FXML
    private fun onbtnInsertar() {
        try{
            val nombre = txtNombre.text
            val cod_prod = txtCodProd.text.toInt()
            val cod_cat = txtCodCat.text.toInt()
            val cant = txtCantidad.text.toInt()
            val precio = txtPrecio.text.toInt()

            val connection: Connection =
                    DriverManager.getConnection(Constantes.url, Constantes.user, Constantes.password)

            val query = "INSERT INTO productos (nombre, cod_prod, cod_cat, cant, precio VALUES (?, ?, ?, ?, ?)"

            val statement: PreparedStatement = connection.prepareStatement(query)

            statement.setString(1, nombre)
            statement.setInt(2, cod_prod)
            statement.setInt(3, cod_cat)
            statement.setInt(4, cant)
            statement.setInt(5, precio)

            statement.executeUpdate()

            connection.close()
        }catch(e: SQLException){
            e.printStackTrace()
        }
    }
}
