package com.example.examenzombie

import BBDD.Zombies.Zombie
import BBDD.Zombies.ZombieAtacante
import BBDD.Zombies.ZombieDefensor
import Fichero.FicheroZombie
import Servicio.ServicioZombie
import javafx.beans.property.SimpleObjectProperty
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.stage.Modality
import javafx.stage.Stage
import java.net.URL
import java.util.*

class ConsultaZombieController: Initializable {
    @FXML private lateinit var NombreColumn: TableColumn<Zombie, String>
    @FXML private lateinit var MovilidadColumn: TableColumn<Zombie, Int>
    @FXML private lateinit var AgresividadColumn: TableColumn<Zombie, Int>
    @FXML private lateinit var MaximoColumn: TableColumn<Zombie, Int>
    @FXML private lateinit var tablaZombies: TableView<Zombie>

    private lateinit var obList: ObservableList<Zombie>
    private val servicioZombie = ServicioZombie()

    fun actualizarTabla(){
        NombreColumn.setCellValueFactory { CellData -> SimpleObjectProperty(CellData.value.nombre) }
        MovilidadColumn.setCellValueFactory { CellData -> SimpleObjectProperty(CellData.value.movilidad) }
        AgresividadColumn.setCellValueFactory { CellData ->
            when (val value = CellData.value){
                is ZombieAtacante -> SimpleObjectProperty(value.agresividad)
                is ZombieDefensor -> SimpleObjectProperty(value.agresividad)
                else -> null
            }
        }
        MaximoColumn.setCellValueFactory { CellData ->
            when (val value = CellData.value){
                is ZombieAtacante -> null
                is ZombieDefensor -> SimpleObjectProperty(value.numDisparos)
                else -> null
            }
        }
    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        obList = FXCollections.observableArrayList() //inicializamos nuestra obList

        actualizarTabla()
        for (i in servicioZombie.seleccionarZombie()){
            obList.add(i)
        }
        tablaZombies.items = obList
    }

    fun onbtnAtras(){
        val loader = FXMLLoader(javaClass.getResource("crearCazador-view.fxml"))
        val root = loader.load<Parent>()
        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.close()
    }
}