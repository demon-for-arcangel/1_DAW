package com.example.tabla_bbdd_persona

import BaseDatos.Alumnado
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import javafx.scene.control.TableColumn
import java.net.URL
import java.util.*

class VerDatosController {
     var alumno=Alumnado()

    @FXML
    private lateinit var  lblNombre: Label

    @FXML
    private lateinit var  lblEdad: Label




    fun inicializar(a:Alumnado){
        alumno = a
        lblNombre.text = alumno.nombre
        lblEdad.text = alumno.edad.toString()
    }
    @FXML
    fun onPulsarButton (){
        lblNombre.text = alumno.nombre
        lblEdad.text = alumno.edad.toString()
    }


}