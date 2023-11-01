class Juego {
    val tablero = Tablero()
    var ficha: String = "x"

    fun start(){
        while (true){
            print(tablero)
            var mover = getMove(ficha)
            tablero.moverFicha(ficha)

            if (tablero.)
        }
    }

    fun getMove(jugador: Char): Int{
        while(true){
            print("jugador $jugador, introduce el movimiento que desee realizar: ")
        }
    }
}