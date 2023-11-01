package com.example.vista2

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField

class PrincipalController {
    @FXML
    private lateinit var txtNumero1: TextField
    @FXML
    private lateinit var txtNumero2: TextField
    @FXML
    private lateinit var txtSolucion: TextField


    @FXML
    private fun sumar() {
        // Primera manera de realizar, usando variables externas
        var x = (txtNumero1.text).toInt()
        var y = (txtNumero2.text).toInt()
        var sol = x + y
        txtSolucion.text = sol.toString()

        // Segunda manera de realizar, sin usar variables externas
        //txtSolucion.text = ((txtNumero1.text).toInt() + (txtNumero2.text).toInt()).toString()
    }

    @FXML
    private fun restar(){
        txtSolucion.text = ((txtNumero1.text).toInt() - (txtNumero2.text).toInt()).toString()
    }

    @FXML
    private fun multiplicar(){
        txtSolucion.text = ((txtNumero1.text).toInt() * (txtNumero2.text).toInt()).toString()
    }

    @FXML
    private fun dividir(){
        txtSolucion.text = ((txtNumero1.text).toInt() / (txtNumero2.text).toInt()).toString()
    }
}