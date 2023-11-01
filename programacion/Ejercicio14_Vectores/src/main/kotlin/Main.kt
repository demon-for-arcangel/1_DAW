/*
La mosca será un valor que se introduce en una posición de un vector
El jugador no ve el panel pero si las casillas que puede golpear
Si la mosca está en esa posición se acaba el juego, mosca cazada, sino puede ocurrir dos cosas:
    -
    -
 */

fun main(args: Array<String>) {
    var tamanio: Int = 0
    var golpe: Int = 0

    println("¿Cuántas casillas quieres que tenga el tablero?")
    tamanio = readln().toInt()
    var tablero = Array<Int>(5){0} //crear array (vector a ceros)
    var seguir: Boolean = true

    do {
        var posicion = (0..tamanio).random()
        tablero[posicion] = -1 // colocacion mosca

        println("Dime la posición (1 - ${tamanio})")
        golpe =
            (readln().toInt()) - 1 // se le resta -1 porque a la persona le pedimos de 1-9 nosotros utilizamos de 0-9

        // if (golpe == posicion){
        if (tablero[golpe] == -1) {
            println("Has acertado. Mosca muerta")
            seguir = false
        } else {
            println("Has fallado.")
            if (revolotear(tablero, tamanio - 1, golpe)) {// funcion que mira si la mosca esta en uno de los adyacentes
                tablero[posicion] = 0
                posicion = (0..tamanio).random()
                tablero[posicion] = -1
            }
        }
    }while (seguir)
}

fun revolotear (tablero: Array<Int>, tamanio: Int, golpe: Int): Boolean{
    var adyacente: Boolean = false
    // si mosca está en adyacentes se mueve
    if (tablero[0] == -1){
        if (tablero[1] == -1){
            adyacente = true
        }
    }
    if (tablero[tamanio] == -1){
        if (tablero[tamanio-1] == -1){
            adyacente = true
        }
    }
    if ((golpe > 0) || (golpe < tamanio)){
        if (tablero[golpe-1] == -1 || tablero[golpe+1] == -1){
            adyacente = true
            // mosca cambia de posicion ya que esta en uno de los adyacentes de donde hemos dado el golpe
        }
    }
    return adyacente
}