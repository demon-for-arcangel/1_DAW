// Marina Laguna Valdepeñas 1ºDAW
fun main(args: Array<String>) {
    //creamos a los jugadores
    var opcionHumano: String = ""
    var opcionPc: String = ""
    var victorias = Array<Int>(2){0}


    println("=========================")
    println("PC")
    println("Has puntuado en la jugada: ${ResumenAciertos()}")
    println("__________________________")
    println("Humano")
    println("Has puntuado en la jugada: ${ResumenAciertos()}")
    println("${juego()}")
    println("=========================")
}

fun ResumenAciertos() {

}

fun juego() {
    //creamos el tablero
    val N: Int = 6
    var tablero = Array(N){Array<String>(N){"[ ]"}}

    var i: Int = 0
    var j: Int = 0

    //recorrer la matriz y mostrarla por pantalla
    while (i < tablero.size){
        j = 0
        while (j < tablero.size){
            print(tablero[i][j])
            j++
        }
        i++
        println()
    }
}

fun rellenarTablero(){

}