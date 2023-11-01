package com.example.tabla_bbdd_persona

import javafx.collections.ObservableList
import javafx.fxml.FXML
import BaseDatos.*
import Servicio.*
import javafx.beans.binding.Bindings
import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.stage.Modality
import javafx.stage.Stage

import java.net.URL
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*

class AlumnadoController: Initializable {
    @FXML
    private lateinit var  colId: TableColumn<Alumnado, Int>
    @FXML
    private lateinit var colNombre: TableColumn<Alumnado, String>
    @FXML
    private lateinit var  colEdad: TableColumn<Alumnado, Int>
    @FXML
    private lateinit var colFecha: TableColumn<Alumnado, Date>
    @FXML
    private lateinit var colMatriculado: TableColumn<Alumnado, Boolean>
    @FXML
    private lateinit var colFechaString: TableColumn<Alumnado, String>

    @FXML
    private lateinit var tablaAlumno: TableView<Alumnado>

    //private lateinit var btnEliminar: Button

    private lateinit var obLista: ObservableList<Alumnado>
    private val alumnoService = AlumnadoServicio()

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        //asociamos los elementos de la clase alumnado con cada una de las columnas,
        // por medio de una funcion lambda
        colId.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.id)
        }
        colNombre.setCellValueFactory { cellData ->
            SimpleStringProperty(cellData.value.nombre)
        }
        colEdad.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.edad)
        }
        colMatriculado.setCellValueFactory { cellData ->
            SimpleBooleanProperty(cellData.value.matriculado)
        }

        colFechaString.setCellValueFactory { cellData ->
            SimpleStringProperty(cellData.value.fechaString)
        }

        colFecha.setCellValueFactory {
                cellData->
            val fechaNacimiento = cellData.value.fechaNacimiento
            val fechaNacimientoSql =
                java.sql.Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant())
            SimpleObjectProperty(fechaNacimientoSql)
        }

        obLista = FXCollections.observableArrayList()
        for (i in alumnoService.seleccionarAlumnos()){
            obLista.add(i)
        }
        tablaAlumno.items=obLista //el items de la tabla es el que necesita la conversion de String --> SimpleStringProperty para poder representarlos internamente
    }
    @FXML
    private fun btnEliminarPulsado() {
        val alert = Alert(Alert.AlertType.INFORMATION)
        alert.title = "Eliminar"
        //alert.headerText = "Look, a Confirmation Dialog"
        alert.contentText = "Vas a borrar el Alumno Seleccionado?"

        // Agregando botones personalizados
        val buttonTypeOne = ButtonType("Si")
        val buttonTypeTwo = ButtonType("No")
        alert.buttonTypes.setAll(buttonTypeOne, buttonTypeTwo)

        val result = alert.showAndWait()

        if (result.get() == buttonTypeOne) {
            val personaSeleccionada = tablaAlumno.selectionModel.selectedItem
            if (personaSeleccionada != null) {
                tablaAlumno.items.remove(personaSeleccionada)
                alumnoService.borrarAlumnado(personaSeleccionada.id)
                tablaAlumno.refresh() //actualiza la tabla, en este caso no se necesita, pero por si acaso
            }
        }



    }
    @FXML
    private fun pulsadoVer(){
       //  if  (tablaAlumno.selectionModel.isSelected(1)) {
       if  (tablaAlumno.selectionModel.selectedItem != null) {
           val fxmlLoader = FXMLLoader(AlumnadoController::class.java.getResource("VerDatos-view.fxml"))

           val scene = Scene(fxmlLoader.load(), 320.0, 400.0)
           val detailController = fxmlLoader.getController<VerDatosController>()
           detailController.inicializar(tablaAlumno.selectionModel.selectedItem)
           //var pp = Alumnado()

           //detailController.alumno = tablaAlumno.selectionModel.selectedItem

           // detailController.inicializoConDatos()
           var stage = Stage()
           stage.title = "Ver Datos"
           stage.initModality(Modality.APPLICATION_MODAL)
           stage.scene = scene
           stage.showAndWait()
       }

    }
}