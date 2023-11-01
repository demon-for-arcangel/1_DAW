fun main(args: Array<String>) {
    var N = 3
    var arrTablero = Array(N){IntArray(N){-1}}
    var juego = Tablero()

    var PC = 0
    var Human = 1

    while (juego.checkLinea(arrTablero,PC)||juego.checkLinea(arrTablero,Human)){
        println("")
        juego.moverFicha()
    }
}