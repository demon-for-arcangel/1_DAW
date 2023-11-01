fun main(args: Array<String>) {
    var feliz = Array<Int>(1){0}
    feliz[0] = madrugar()
    var tiempo: Int = 0
    while (tiempo < 22){
        if (chequeoFelicidad(feliz[0])){
            print("Hora: ${tiempo} Cargando felicidad ${feliz[0]}")
            while(feliz[0] < (20 + tiempo)){
                felicidad(feliz)
                print("..${feliz[0]}")
            }
            println()
        }
        if (tiempo >= 8 && tiempo <= 14){
            println("Hora ${tiempo}")
            aburrimientoExtremo()
            println()
        }
        tiempo++
    }
    tiempo = 0
    while ((tiempo < 3600) && (tenerSuenio(tiempo) != 25)){
        tiempo++
        contarOvejar()
    }
    println("DULCES SUEÑOS")
}

fun aburrimientoExtremo(): Int{
    var x: Int
    var y: Int
    do{
        x = (1 .. 9).random()
        y = (2 .. 9).random()
        if (x+y == 12){
            print("${x}, ${y}")
        }
    }
}

fun madrugar(): Int{
    return(0 .. 9).random()
}

fun felicidad(){

}