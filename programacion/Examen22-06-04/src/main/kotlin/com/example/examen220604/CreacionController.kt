package com.example.examen220604

import BBDD.Constantes
import BBDD.Tesela.FactoriaTesela
import BBDD.Tesela.TeselaReal
import Ficheros.FicheroSerializable
import Ficheros.FicheroTexto
import Servicio.TeselaServicio
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.*
import java.lang.Exception
import java.net.URL
import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.SQLException
import java.util.*

class CreacionController: Initializable {
    var tesela = TeselaServicio()

    @FXML
    private lateinit var txtId: TextField

    @FXML
    private lateinit var sliderAncho: Slider
    @FXML
    private lateinit var sliderLargo: Slider

    @FXML
    private lateinit var cbMaterial: ComboBox<String>
    @FXML
    private lateinit var cbColor: ComboBox<String>
    @FXML
    private lateinit var cbColocacion: ComboBox<String>
    @FXML
    private lateinit var cbEstado: ComboBox<String>

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        configurarSlider()
        configurarComboBox()
    }

    private fun configurarSlider() {
        //Configuracion de Slider --> Para el atributo Ancho
        sliderAncho.min = 0.0
        sliderAncho.max = 20.0
        sliderAncho.value = 10.0
        //para que el slider nos ponga los numeros debajo
        sliderAncho.isShowTickLabels = true
        sliderAncho.isShowTickMarks = true
        sliderAncho.majorTickUnit = 5.0
        sliderAncho.minorTickCount = 1
        //el incremento sea de 1 en 1
        sliderAncho.blockIncrement = 1.0

        //Configuracion Slider --> Para el atributo Alto
        sliderLargo.min = 0.0
        sliderLargo.max = 20.0
        sliderLargo.value = 5.0
        sliderLargo.isShowTickLabels = true
        sliderLargo.isShowTickMarks = true
        sliderLargo.majorTickUnit = 5.0
        sliderLargo.blockIncrement = 1.0
    }

    private fun configurarComboBox() {
        // Configuración de ComboBoxes
        cbMaterial.items.addAll("Mármol", "Arcilla", "Piedra")
        cbColor.items.addAll("Rojo", "Verde", "Azul")
        cbColocacion.items.addAll("Derecha", "Izquierda", "Centro", "Superior", "Inferior")
        cbEstado.items.addAll("Mal", "Aceptable", "Bueno", "Excelente")
    }

    @FXML
    fun onbtnGuardarBBDD() {
        try {
            val id = txtId.text.toInt()
            val ancho = sliderAncho.value.toInt()
            val largo = sliderLargo.value.toInt()
            val material = cbMaterial.value
            val color = cbColor.value
            val colocacion = cbColocacion.value
            val estado = cbEstado.value

            val connection: Connection =
                DriverManager.getConnection("jdbc:mysql://localhost/nombreBaseDatos", "root", "")

            val query = Constantes.teselaSQL1

            val statement: PreparedStatement = connection.prepareStatement(query)

            statement.setInt(1, ancho)
            statement.setInt(2, largo)
            statement.setString(3, material)
            statement.setString(4, color)
            statement.setString(5, colocacion)
            statement.setString(6, estado)
            statement.setInt(7, id)

            statement.executeUpdate()

            //Ventana de Información
            val alert = Alert(Alert.AlertType.INFORMATION)
            alert.title = "Éxito"
            alert.headerText = "Archivo creado"
            alert.contentText = "El archivo se ha creado correctamente."
            alert.showAndWait()
        } catch (e: SQLException) {
            println(e.message)
        }
    }

    @FXML
    fun onbtnGuardarFTexto() {
        try{
            val factoriaTesela = FactoriaTesela()
            val material = cbMaterial.value.toString()
            val color = cbColor.value.toString()
            val ancho = sliderAncho.value.toInt()
            val largo = sliderLargo.value.toInt()
            val colocacion = cbColocacion.value.toString()
            val estadoConservacion = cbEstado.value.toString()

            val tesela = factoriaTesela.crearTesela(material, color, ancho, largo, colocacion, estadoConservacion)

            val fichero = FicheroTexto()

            fichero.escribir(tesela, "tesela.txt")

            val alert = Alert(Alert.AlertType.INFORMATION, "La tesela se ha guardado correctamente.", ButtonType.OK)
            alert.title = "Guardado exitoso"
            alert.headerText = null
            alert.showAndWait()
        } catch (e: Exception) {
            val alert = Alert(Alert.AlertType.ERROR, "Error al guardar la tesela.", ButtonType.OK)
            alert.title = "Error"
            alert.headerText = null
            alert.showAndWait()
        }
    }

    @FXML
    fun onbtnGuardarFSerializable() {
        try {
            val tesela = TeselaReal()
            val fichero = FicheroSerializable()
            fichero.guardar(tesela, "tesela.dat")

            val alert = Alert(Alert.AlertType.INFORMATION, "La tesela se ha guardado correctamente.", ButtonType.OK)
            alert.title = "Guardado exitoso"
            alert.headerText = null
            alert.showAndWait()
        } catch (e: Exception) {
            val alert = Alert(Alert.AlertType.ERROR, "Error al guardar la tesela.", ButtonType.OK)
            alert.title = "Error"
            alert.headerText = null
            alert.showAndWait()
        }
    }
}
