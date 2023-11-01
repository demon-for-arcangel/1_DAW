package com.example.examen22052023

import BBDD.Destinos.Destino
import BBDD.Usuario.Usuario
import BBDD.Viaje.Viaje
import Servicio.ViajeServicio
import javafx.beans.Observable
import javafx.beans.property.SimpleObjectProperty
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import java.net.URL
import java.time.LocalDate
import java.time.ZoneId
import java.util.*

class TablaController: Initializable {
    @FXML private lateinit var colUsuario: TableColumn<Usuario, String>
    @FXML private lateinit var colDestino: TableColumn<Destino, String>
    @FXML private lateinit var colFecha: TableColumn<Viaje, LocalDate>
    @FXML private lateinit var colPagado: TableColumn<Viaje, Boolean>

    @FXML private lateinit var tablaViaje: TableView<Viaje>

    private lateinit var obLista: ObservableList<Viaje>
    private val viajeService = ViajeServicio()

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        colUsuario.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.nombre)
        }

        colDestino.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.nombre)
        }

        colFecha.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.fecha_viaje)
        }
/*
        colFecha.setCellValueFactory {
            cellData->
            val fechaViaje = cellData.value.fecha_viaje
            val fechaViajeSql =
                    java.sql.Date.from(fechaViaje.atStartOfDay(ZoneId.systemDefault()).toInstant())
            SimpleObjectProperty(fechaViajeSql)
        } --> Da error*/

        colPagado.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.pagado)
        }

        obLista = FXCollections.observableArrayList()
        for (i in viajeService.seleccionarViaje()){
            obLista.add(i)
        }
        tablaViaje.items=obLista
    }
}