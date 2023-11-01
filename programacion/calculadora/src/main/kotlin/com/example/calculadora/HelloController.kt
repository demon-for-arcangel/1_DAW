package com.example.calculadora

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField

class HelloController {
    @FXML private lateinit var txtField: TextField
    @FXML private lateinit var btnValor1: Button
    @FXML private lateinit var btnValor2: Button
    @FXML private lateinit var btnValor3: Button
    @FXML private lateinit var btnValor4: Button
    @FXML private lateinit var btnValor5: Button
    @FXML private lateinit var btnValor6: Button
    @FXML private lateinit var btnValor7: Button
    @FXML private lateinit var btnValor8: Button
    @FXML private lateinit var btnValor9: Button
    @FXML private lateinit var btnValor0: Button
    @FXML private lateinit var btnSuma: Button
    @FXML private lateinit var btnResta: Button
    @FXML private lateinit var btnMultiplicacion: Button
    @FXML private lateinit var btnDivision: Button
    @FXML private lateinit var btnBorrarUno: Button
    @FXML private lateinit var btnBorrarTodo: Button

    var operationOn: Boolean = true
    @FXML
    private fun onCleanScreen(){ //funcion para eliminar td lo escrito
        txtField.setText("")
        operationOn = true
    }

    @FXML
    private fun onDeleteValue(){ //función para eliminar uno por uno
        if (!(txtField.getText().length == 0)){
            txtField.setText(txtField.getText().substring(0, txtField.getText().length - 1)) //substring coge del punto que queramos del texto, cogemos el texto y lo volvemos a poner restandole uno
        }
    }

    @FXML
    private fun onMakeOperation(){ //realizar operacion

    }

    @FXML
    private fun onAddValue(){// Añadir valor
        //txtField.setText(txtField.getText()
    }

    @FXML
    private fun onAddOperation(){ //Añadir Operacion

    }
}