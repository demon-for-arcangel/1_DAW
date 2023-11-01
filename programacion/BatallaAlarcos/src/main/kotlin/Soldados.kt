import kotlin.random.Random

class Soldados {
    var nombre: String = generarNombreAleatorio()
    var fuerza: Int = Random.nextInt(0, 100)
    var estado: Boolean = true //variable si el estado es true esta vivo si es false esta muerto

    constructor(nombre: String, fuerza: Int){
        this.nombre = nombre
        this.fuerza = fuerza
    }

    private fun generarNombreAleatorio(): String{
        val nombres = listOf("Hugo", "Lucas", "Martín", "Daniel", "Pablo", "Mateo", "Leo", "Eric", "Noah", "Axel", "Alan", "Apolo", "Dante")
        return nombres[(0 until nombres.size).random()]
    }
}