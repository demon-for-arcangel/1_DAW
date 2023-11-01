package com.example.proyectoamazonclase

import BBDD.Objetos.Objetos
import Servicio.ServicioObjetos
import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.stage.Modality
import javafx.stage.Stage
import java.net.URL
import java.util.*

class TablaController : Initializable {
    @FXML
    private lateinit var idColumn: TableColumn<Objetos, Int>
    @FXML
    private lateinit var NombreColumn: TableColumn<Objetos, String>
    @FXML
    private lateinit var PesoColumn: TableColumn<Objetos, Int>
    @FXML
    private lateinit var PeligrosoColumn: TableColumn<Objetos, Boolean>
    @FXML
    private lateinit var Tabla: TableView<Objetos>

    private lateinit var obsList: ObservableList<Objetos>
    private val servicioObjeto = ServicioObjetos()

    fun actualizarTabla(){
        idColumn.setCellValueFactory { CellData -> SimpleObjectProperty(CellData.value.id) }
        NombreColumn.setCellValueFactory { CellData -> SimpleStringProperty(CellData.value.nombre) }
        PesoColumn.setCellValueFactory { CellData -> SimpleObjectProperty(CellData.value.peso) }
        PeligrosoColumn.setCellValueFactory { CellData -> SimpleBooleanProperty(CellData.value.peligroso) }

        obsList = FXCollections.observableArrayList()
    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        actualizarTabla()
        for (i in servicioObjeto.seleccionObjeto()){
            obsList.add(i)
        }
        Tabla.items = obsList
    }

    @FXML
    private fun onbtnAceptar(){
        val fxmlLoader = FXMLLoader(TablaController::class.java.getResource("datos-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 400.0)
        val detailController = fxmlLoader.getController<DatosController>()
        detailController.objeto = Tabla.selectionModel.selectedItem
        detailController.inicializar()

        var stage = Stage()
        stage.title = "Ver Datos"
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.scene = scene
        stage.showAndWait()
    }

    @FXML
    private fun Guardar(){
        actualizarTabla()
    }

    val obj = ServicioObjetos()

    @FXML
    private fun onbtnFichero(){
        val infoAlert = Alert(Alert.AlertType.INFORMATION)
        infoAlert.title = "Fichero"
        infoAlert.headerText = "CREACIÓN DE FICHERO"
        infoAlert.contentText = "Fichero creado exitosamente"
        infoAlert.showAndWait()
        obj.onbtnFichero()
    }
}