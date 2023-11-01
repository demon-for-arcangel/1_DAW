package com.example.seguimientoempresa

import BBDD.ConexionBD
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.DatePicker
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.stage.Modality
import javafx.stage.Stage
import java.io.IOException
import java.net.URL
import java.sql.*
import java.util.*

class AltaController: Initializable {
    @FXML private lateinit var textNombre: TextField
    @FXML private lateinit var textPrimerApellido: TextField
    @FXML private lateinit var textSegundoApellido: TextField
    @FXML private lateinit var FechaNacimiento: DatePicker
    @FXML private lateinit var textNumeroPersonal: TextField
    @FXML private lateinit var btnSalir: Button


    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        //No se necesita ninguna lógica de inicialización
    }

    @FXML
    private fun onbtnRegistrarse() {
        try {
            val nombre = textNombre.text
            val primerApellido = textPrimerApellido.text
            val segundoApellido = textSegundoApellido.text
            val fechaNacimiento = FechaNacimiento.value //Obtener el valor seleccionado del DatePicker
            val numeroPersonal = textNumeroPersonal.text

            //Establecer conexión con la bbdd
            val connection: Connection =
                DriverManager.getConnection("jdbc:mysql://localhost/emociones", "root", "")

            //Construir la consulta de inserción
            val query =
                "INSERT INTO usuario (nombre, primerApellido, segundoApellido, fechaNacimiento, numeroPersonal) VALUES (?, ?, ?, ?, ?)"

            //Preparar la consulta
            val statement: PreparedStatement = connection.prepareStatement(query)

            //Establecer los parámetros de la consulta
            statement.setString(1, nombre)
            statement.setString(2, primerApellido)
            statement.setString(3, segundoApellido)
            statement.setString(4, fechaNacimiento.toString()) //Convertir la fecha a una cadena de texto
            statement.setString(5, numeroPersonal)

            //Ejecutar la consulta de inserción
            statement.executeUpdate()

            //Cerrar la conexión
            connection.close()
        } catch (e: SQLException) {
            e.printStackTrace()
        }
//BBDD
        val numeroPersonal = textNumeroPersonal.text
        //Establecer la conexión a la base de datos
        val url = "jdbc:mysql://localhost/emociones"
        val user = "root"
        val password = ""

        var connection: Connection? = null
        var statement: Statement? = null
        var resultSet: ResultSet? = null

        try {
            //Establecer la conexión
            connection = DriverManager.getConnection(url, user, password)

            //Crear la consulta SQL para verificar el número Personal
            val query = "SELECT * FROM usuario"

            //Ejecutar la consulta
            statement = connection.createStatement()
            resultSet = statement.executeQuery(query)

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
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }catch (e: SQLException){
            e.printStackTrace()
        }
    }

    @FXML
    private fun onbtnSalir(){
        val primaryStage = (btnSalir.scene.window as Stage)
        val root = FXMLLoader.load<Parent>(javaClass.getResource("principal-view.fxml"))
        val scene = Scene(root)
        primaryStage.scene = scene
    }
}