package vista.vista1

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import java.security.Principal

class PrincipalApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(PrincipalApplication::class.java.getResource("Principal-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(PrincipalApplication::class.java)
}