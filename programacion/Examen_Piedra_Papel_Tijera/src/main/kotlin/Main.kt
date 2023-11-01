fun main(args: Array<String>) {
    // 0 Piedras 1 Papel 2 Tijeras
    var opcionHumano: Int
    var opcionPC: Int
    var ganador: String = ""
    var victorias = Array<Int>(2){0} //[0] victorias pc [1] victorias humano
    var contarDecisiones = Array<Int>(3){0} // [0] piedras [1] papel [2] tijeras
    do{
        opcionPC = elegir()
        opcionHumano = pedir()
        traducir(opcionPC, "Pc")
        traducir(opcionHumano, "Humano")
        ganador = ganadorMano(opcionPC, opcionHumano)
        println("Gana: ${ganador}")
        contarDecisiones[opcionPC] = contarDecisiones[opcionPC] + 1
        contarDecisiones[opcionHumano] = contarDecisiones[opcionHumano] + 1

        guardarVictorias(victorias, ganador)
    }while(seguirJuego(victorias))
    escribirResumen(victorias, contarDecisiones)
}

fun escribirResumen(v: Array<Int>, c: Array<Int>){
    println("Pc: ${v[0]}")
    println("Humano: ${v[1]}")
    println("Piedra: ${c[0]} Papel: ${c[1]} Tijeras: ${c[2]}")
}

fun guardarVictorias(v: Array<Int>, g: String){
    if (g.equals("Pc")) v[0] = v[0] +1
    if (g.equals("Humano")) v[1] = v[1] + 1
}

fun traducir(n: Int, jugador: String){
    when (n){
        0 -> println("${jugador} ha elegido Piedra")
        1 -> println("${jugador} ha elegido Papel")
        2 -> println("${jugador} ha elegido Tijeras")
    }
}

fun ganadorMano(p: Int, h: Int): String{
    var ganador: String = "Tablas"
    when (p){ //p es la elección del pc
        0 -> when (h){
            1 -> ganador = "Humano"
            2 -> ganador = "Pc"
        }
        1 -> when (h){
            2 -> ganador = "Humano"
            0 -> ganador = "Pc"
        }
        2 -> when (h){
            0 -> ganador = "Humano"
            1 -> ganador = "Pc"
        }
    }
    return ganador
}

fun seguirJuego(v: Array<Int>): Boolean{
    var seguir: Boolean = false
    if (v[0] == 3){
        seguir = true
    }
    if (v[1] == 3){
        seguir = true
    }
    return seguir
    // return (v[0] != 3 && v[1] != 3) hace lo de las líneas anteriores
}

fun elegir(): Int{
    return(0 .. 2).random()
}
fun pedir(): Int {
    var valor: Int = 0
    var peticion: String
    do{
        println("Elige piedra, papel o tijera")
        peticion = readln().lowercase()
    }while(!(peticion.equals("piedra") || peticion.equals("papel") || peticion.equals("tijera")))
    when (peticion){
        "piedra" -> valor = 0
        "papel" -> valor = 1
        "tijera" -> valor = 2
    }
    return TODO("Provide the return value")
}