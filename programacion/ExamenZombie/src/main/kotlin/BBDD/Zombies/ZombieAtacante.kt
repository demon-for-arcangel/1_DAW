package BBDD.Zombies

import BBDD.Extremidades.Extremidades

open class ZombieAtacante: Zombie { //Hereda porque tiene las mismas caracteristicas que un zombie normal
    var agresividad: Int = 0

    constructor()
    constructor(nombre: String, movilidad: Int, agresividad: Int, extremidades: List<Extremidades>): super(nombre, movilidad, extremidades){
        this.agresividad = agresividad
    }

    fun tareaAdecuada(agresividadNecesaria: Int): Boolean{
        return agresividad > agresividadNecesaria
    }
    /*
        fun analizarTarea(tarea: String, agresividadNecesaria: Int){
            val esAdecuada = tareaAdecuada(agresividadNecesaria)
            val mensaje = if (esAdecuada) "Soy capaz de realizar la tarea '$tarea'." else "No soy capaz de realizar la tarea '$tarea'."
            println(mensaje)
        }*/

    override fun toString(): String {
        return "${super.toString()}\nAgresividad: $agresividad"
    }
}