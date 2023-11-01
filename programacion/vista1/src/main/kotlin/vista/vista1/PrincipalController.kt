package vista.vista1

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField

class PrincipalController {
    @FXML
    private lateinit var txtnombre: TextField

    @FXML
    private fun pulsarBoton() {
        txtnombre.text = "Hola"
    }
}