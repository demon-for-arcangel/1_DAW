// Marina Laguna Valdepeñas 1ºDAW
fun main(args: Array<String>) {
    val N: Int = 3
    var marte = Array(N){Array<Int>(N){0}}
    var cantidad: Int = 0

    imprimirMarte()
    println("La zona atacada, ${alertaMarte()}")
    println("La energía de la zona atacada, ${energiaAtacada()} ")
}

fun imprimirMarte() {
    val N: Int = 3
    var marte = Array(N){Array<Int>(N){0}}

    var i: Int = 0
    var j: Int = 0

    while (i < marte.size){
        print("[${marte[i][j]}]")
        j++
    }
    println()
    i++
}

fun aumentarEnergia (marte: Array<Int>, cantidad: Int){
    if (alertaMarte() > 57){
        if (energiaZonas() % 2 == 0){
            energiaZonas() = energiaZonas() - 15
        }else{
            energiaZonas() = energiaZonas() - 6
        }
    }
}

fun nivelZona(){

}

fun energiaZonas(marte: Array<Int>){
    var i: Int = 0
    marte[i] = (0 .. 150).random()
}

fun alertaMarte(): Int {
    var zonaAtacada: Int = 0
    zonaAtacada = (-2 .. 9).random()
}

fun ataqueMarte(){

}

fun energiaAtacada(marte: Array<Int>){
    var i: Int = 0
    if (alertaMarte() == marte[i]){
        println("${energiaZonas()}")
    }
}