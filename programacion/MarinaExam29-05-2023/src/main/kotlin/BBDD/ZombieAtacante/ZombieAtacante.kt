package BBDD.ZombieAtacante

import BBDD.Constantes
import BBDD.ZombieNormal.ZombieNormal
import BBDD.Tarea.Tarea
import java.io.Serializable

open class ZombieAtacante: ZombieNormal, Serializable {
    var agresividad: Int = 0

    constructor(){}
    constructor(mov: Int, nom: String, agre: Int): super(mov, nom){
        //this.movilidad = mov
        //this.nombre = nom
        agresividad = agre
    }

    constructor(string: String?)

    open fun realizarTarea(e: Tarea): Int{
        var i: Int = Constantes.noPuedoRealizarTarea
        if ((e.agresividadMinima <= this.agresividad)) i=Constantes.PuedoRealizarTarea
        return i
    }
}