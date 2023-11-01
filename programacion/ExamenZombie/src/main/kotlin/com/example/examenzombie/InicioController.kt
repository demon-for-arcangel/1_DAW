package com.example.examenzombie

import BBDD.Constantes
import BBDD.Zombies.Zombie
import Servicio.ServicioCazador
import Servicio.ServicioZombie
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Label
import javafx.scene.control.TextInputDialog
import javafx.scene.layout.VBox
import javafx.stage.Modality
import javafx.stage.Stage

class InicioController {
    private var cazador = ServicioCazador()
    private var juego = Juego()
    private var zombies = ArrayList<Zombie>()

    @FXML
    private fun crearZombie() {
        val zombie = ServicioZombie()
        var zombies = zombie.crearZombie()
        val infoAlert = Alert(Alert.AlertType.INFORMATION)
        infoAlert.title = "Información"
        infoAlert.headerText = "CREACIÓN DE ZOMBIE"
        infoAlert.contentText = "Zombie creado exitosamente"
        zombie.guardarZombieEnArchivo(Constantes.FicheroZombie, zombies)
        infoAlert.showAndWait()
    }

    @FXML
    private fun consultarZombie(){
        // cargar la nueva pantalla
        val loader = FXMLLoader(javaClass.getResource("consultaZombie-view.fxml"))
        val root = loader.load<Parent>()
        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.showAndWait()
    }

    @FXML
    private fun crearCazador(){
        val loader = FXMLLoader(javaClass.getResource("crearCazador-view.fxml"))
        val root = loader.load<Parent>()
        val stage = Stage()
        stage.scene = Scene(root)
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.showAndWait()
    }

    @FXML
    private fun crearFichero(){
        val dialog = TextInputDialog()
        dialog.title = "Fichero"
        dialog.headerText = null
        dialog.contentText = "Nombre:"
        val result = dialog.showAndWait()
        var nombre = Constantes.FicheroCazador
        if (result.isPresent){
            nombre = result.get()
        }
        cazador.leerFichero(nombre)
    }

    @FXML
    private fun onbtnJugar() {
        val alert = Alert(Alert.AlertType.INFORMATION)
        alert.title = "Simulación del Juego"
        alert.headerText = "Simulación en progreso"
        alert.contentText = "La simulación del juego está en curso. Por favor, espere..."
        alert.show()

        juego.simulacion()

        val resultados = juego.historial(cazador.obtenerCazador(), zombies)

        val resultadoLabel = Label("La simulación del juego ha finalizado. Puede revisar los resultados aquí:")
        val resultadosLabel = Label(resultados)

        val vbox = VBox(resultadoLabel, resultadosLabel)
        val scene = Scene(vbox)

        val stage = Stage()
        stage.title = "Resultado de la Simulación"
        stage.scene = scene
        stage.show()

        alert.close()
    }
}