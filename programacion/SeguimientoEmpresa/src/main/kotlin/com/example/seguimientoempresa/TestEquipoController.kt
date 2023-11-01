package com.example.seguimientoempresa

import javafx.fxml.FXML
import javafx.scene.control.ComboBox
import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.SQLException

class TestEquipoController {
    @FXML private lateinit var comboBoxAmbiente: ComboBox<String>
    @FXML private lateinit var comboBoxSobra: ComboBox<String>

    @FXML
    fun oncomboBox(){
        val ambiente = comboBoxAmbiente.value
        val sobra = comboBoxSobra.value

        //Guardar las respuestas en la tabla de bbdd
        GuardarEnTabla(ambiente, sobra)
    }

    private fun GuardarEnTabla(ambiente: String?, sobra: String?){
        val url = "jdbc:mysql://localhost/emociones"
        val user = "root"
        val password = ""

        var connection: Connection? = null
        var preparedStatement: PreparedStatement? = null

        try{
            //Establcer la conexión a la bbdd
            connection = DriverManager.getConnection(url, user, password)

            //Crear la consulta INSERT para guardar las respuestas
            val query = "INSERT INTO test_equipo (ambiente, sobra) VALUES (?, ?)"

            //Preparar la declaración con los valores de las respuestas
            preparedStatement = connection.prepareStatement(query)
            preparedStatement.setString(1, ambiente)
            preparedStatement.setString(2, sobra)

            //Ejecutar la consulta
            preparedStatement.executeUpdate()

            //Las respuestas se han guardado correctamente en la tabla
            println("Respuestas guardadas correctamente en la tabla test_equipo")
        }catch(e: SQLException){
            e.printStackTrace()
        }finally{
            //Cerrar la conexión y liberar los recursos
            preparedStatement?.close()
            connection?.close()
        }
    }
}