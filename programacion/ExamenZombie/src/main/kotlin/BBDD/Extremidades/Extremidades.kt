package BBDD.Extremidades

class Extremidades {
    var id: Int = 0
    var tipos: String = ""

    constructor(){}

    constructor(id: Int, tipos: String){
        this.id = id
        this.tipos = tipos
    }

    constructor(tipos: String){
        this.tipos = tipos
    }

    override fun toString(): String {
        return "Extremidades(id=$id, tipos=$tipos)"
    }
}