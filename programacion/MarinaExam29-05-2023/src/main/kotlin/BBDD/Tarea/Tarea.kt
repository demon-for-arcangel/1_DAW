package BBDD.Tarea

class Tarea {
    var tipo: Int = 0
    var agresividadMinima: Int = 0

    constructor(){}
    constructor(t: Int, a: Int){
        tipo = t
        agresividadMinima = a
    }
}