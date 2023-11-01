class Anilla {
    var color: Int = 0  // rojo = 1, verde = 2, y azul = 3

    constructor(){
        color = (1..3).random()
    }

    override fun toString(): String {
        var colour: String = " "
        when(color){
            1 -> colour = "rojo"
            2 -> colour = "verde"
            3 -> colour = "azul"
            else -> println("color no válido")
        }
        return super.toString()
    }
}