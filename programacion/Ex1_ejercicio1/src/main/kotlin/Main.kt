// Marina Laguna Valdepeñas 1ºDAW
fun main(args: Array<String>) {
    var turno: Int = 1

    do {
        println("Turno $turno")
        println("\t Cola esperando turno")
        print("\t   ")
        print("${crearCola()}")
        //while (i < v.size){
         //   print("[${v[i]}]")
           // i++
        //
        println()
        println("\t Personas atendidas en este turno: ${personaAtendida()}")
        println("\t Cola con los huecos generados")
        print("\t   ")
        print("${huecosGenerados()}")
    }while (turno >= 15)
}

fun crearCola(){
    val N: Int = 25
    var v: Array<Int> = Array(N){(1 .. 19).random()}
    var i: Int = 0

    while (i < v.size){
        print("[${v[i]}]")
        i++
    }
}

fun personaAtendida(): Int{
    var atendida: Int = 0
    atendida = (1 .. 5).random()
    return atendida
}

fun huecosGenerados(){
    var atendida: Int = 0
    atendida = personaAtendida()
    when (atendida){
        1 -> crearCola()

        2 ->

        3 ->
    }
}