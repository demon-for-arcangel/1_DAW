package com.example.seguimientoempresa

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.ComboBox
import javafx.scene.control.SplitMenuButton
import javafx.stage.Modality
import javafx.stage.Stage

class MenuController {
    @FXML private lateinit var comboBoxTest: ComboBox<String>

    @FXML
    fun oncomboBoxTest(){
        //Asignar el evento para manejar la selección de una opción
        comboBoxTest.setOnAction {
            val selectedOption = comboBoxTest.value

            //Realizar la navegación en función de la opción seleccionada
            when (selectedOption){
                "Evalua a tu equipo" -> OpenPage1()
                "Evalua el liderazgo de tu jefe" -> OpenPage2()
                "Evalua tu estado anímico del día" -> OpenPage3()
                "Evalua tu estado de satisfacción en la empresa" -> OpenPage4()
            }
        }
    }

    private fun OpenPage1(){
        //Cargar la vista de la página 1 desde su archivo FXML
        val loader = FXMLLoader(javaClass.getResource("testEquipo-view.fxml"))
        val root: Parent = loader.load()

        //Obtener el controlador de la página
        val controller = loader.getController<TestEquipoController>()

        //Crear una nueva escena y mostrarla en una nueva ventana
        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.initModality(Modality.WINDOW_MODAL)
        stage.show()
    }

    private fun OpenPage2(){
        //Cargar la vista de la página 1 desde su archivo FXML
        val loader = FXMLLoader(javaClass.getResource("testLiderazgo-view.fxml"))
        val root: Parent = loader.load()

        //Obtener el controlador de la página
        val controller = loader.getController<TestLiderazgoController>()

        //Crear una nueva escena y mostrarla en una nueva ventana
        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.initModality(Modality.WINDOW_MODAL)
        stage.show()
    }

    private fun OpenPage3(){
        //Cargar la vista de la página 1 desde su archivo FXML
        val loader = FXMLLoader(javaClass.getResource("testEstadoAnimico-view.fxml"))
        val root: Parent = loader.load()

        //Obtener el controlador de la página
        val controller = loader.getController<TestEstadoAnimicoController>()

        //Crear una nueva escena y mostrarla en una nueva ventana
        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.initModality(Modality.WINDOW_MODAL)
        stage.show()
    }

    private fun OpenPage4(){
        //Cargar la vista de la página 1 desde su archivo FXML
        val loader = FXMLLoader(javaClass.getResource("testEstadoSatisfacion-view.fxml"))
        val root: Parent = loader.load()

        //Obtener el controlador de la página
        val controller = loader.getController<TestEstadoSatisfacionController>()

        //Crear una nueva escena y mostrarla en una nueva ventana
        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.initModality(Modality.WINDOW_MODAL)
        stage.show()
    }
}