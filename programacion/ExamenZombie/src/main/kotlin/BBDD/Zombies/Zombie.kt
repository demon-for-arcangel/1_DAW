package BBDD.Zombies

import BBDD.Extremidades.Extremidades
import java.io.Serializable
import kotlin.random.Random

open class Zombie: Serializable {
    var nombre: String = ""
    var movilidad: Int = 0 //100% se moveran normalmente - 0% no se pueden mover
    var extremidades: List<Extremidades>

    init {
        extremidades = generarExtremidadesAleatorias()
    }

    constructor()

    constructor(nombre: String, movilidad: Int, extremidades: List<Extremidades>){
        this.nombre = nombre
        this.movilidad = movilidad
        this.extremidades = extremidades
    }

    constructor(nombre: String){
        this.nombre = nombre
    }

    open fun generarExtremidadesAleatorias(): List<Extremidades> {
        val extremidadesPosibles = Extremidades()
        val extremidadesAleatorias = ArrayList<Extremidades>()

        if (extremidadesPosibles.tipos.isNotEmpty()){
            val cantidadExtremidades = Random.nextInt(1, 5) // Generar un número aleatorio entre 1 y 4 inclusive

            for (i in 0 until cantidadExtremidades) {
                val extremidadText = extremidadesPosibles.tipos.random()
                val extremidad = Extremidades(extremidadText.toString())
                extremidadesAleatorias.add(extremidad)
            }
        }
        return extremidadesAleatorias
    }

    fun esAutonomo(): Boolean{
        return movilidad > 40
    }

    fun comprobarMovilidad() {
        when (movilidad) {
            100 -> println("El zombie se puede mover normalmente.")
            0 -> println("El zombie no se puede mover.")
            in (40..100) -> println("El zombie es autónomo.")
            else -> println("El zombie no es autónomo.")
        }
    }

    override fun toString(): String {
        return "Nombre: $nombre\nMovilidad: $movilidad%\nAutónomo: ${esAutonomo()}"
    }
}