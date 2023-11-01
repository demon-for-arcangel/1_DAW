package com.example.marinaexam29052023

import BBDD.ZombieAtacante.ZombieAtacante
import BBDD.ZombieDefensor.ZombieDefensor
import BBDD.ZombieNormal.ZombieNormal
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.TableColumn
import java.net.URL
import java.util.*

class ConsultarZombiesController: Initializable {
    @FXML private lateinit var colNombre: TableColumn<ZombieAtacante, String>
    @FXML private lateinit var colMovilidad: TableColumn<ZombieAtacante, Int>
    @FXML private lateinit var tablaZombie: TablaView<ZombieAtacante>

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        TODO("Not yet implemented")
    }
}