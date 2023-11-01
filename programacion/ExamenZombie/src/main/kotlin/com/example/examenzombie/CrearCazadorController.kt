package com.example.examenzombie

import BBDD.Cazador.Cazador
import Fichero.CazadorSerializable
import com.example.examenzombie.Pistola.Pistola
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.ComboBox
import javafx.scene.control.Label
import javafx.scene.control.TextField
import java.lang.IllegalArgumentException
import java.net.URL
import java.util.*
import kotlin.collections.ArrayList

class CrearCazadorController: Initializable {
    var cazador = Cazador()

    @FXML private lateinit var lblNombre: Label
    @FXML private lateinit var cbArmas: ComboBox<String>
    @FXML private lateinit var txtApellido: TextField

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        lblNombre.text = cazador.nombre
        cbArmas.items.addAll("M30", "Revolver", "Ametralladora")
    }

    @FXML
    fun onbtnCrearCazador(){
        val armas = ArrayList<Pistola>()
        val armaSeleccionada = cbArmas.value
        val apellido = txtApellido.text


        var cazador: Cazador
        var cazadorSerializable = CazadorSerializable
        val arma1: Pistola = when (armaSeleccionada){
            "M30" -> Pistola("M30")
            "Revolver" -> Pistola("Revolver")
            "Ametralladora" -> Pistola("Ametralladora")
            else -> throw IllegalArgumentException("Opción invalida")
        }
        val arma2: Pistola = when (armaSeleccionada){
            "M30" -> Pistola("M30")
            "Revolver" -> Pistola("Revolver")
            "Ametralladora" -> Pistola("Ametralladora")
            else -> throw IllegalArgumentException("Opción invalida")
        }
        val arma3: Pistola = when (armaSeleccionada){
            "M30" -> Pistola("M30")
            "Revolver" -> Pistola("Revolver")
            "Ametralladora" -> Pistola("Ametralladora")
            else -> throw IllegalArgumentException("Opción invalida")
        }
        armas.add(arma1)
        armas.add(arma2)
        armas.add(arma3)

        cazador = Cazador(apellido)
        this.cazador = cazador
        cazadorSerializable.insertar("cazador", cazador)
    }
}