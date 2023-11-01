//MARINA LAGUNA VALDEPEÑAS

/*
Realizar el juego del ahorcado
Se debe pedir una palabra a un usuario. Posteriormente se borra.
Se preguntan letras al segundo usuario hasta que decida resolver
Se dan 7 intentos
 */

fun main(args: Array<String>) {
    val secreta: String
    var usadas: String = ""
    var acierto = 0
    var fallo = 0

    println("BIENVENIDO AL JUEGO DEL AHORCADO")
    println("____________________________")
    //println("____________________________")
    println("Introduce la palabra secreta:")
    secreta = readln().uppercase().trim()// convertimos el string en mayúsculas para no tener problemas con las minúsculas y mayúsculas, y elimino espacios en blanco al inicio y fin

    val oculta = Array(secreta.length){"_"} //ocultar la palabra
    oculta.forEach { print("$it") }
    println()

    do { //pedir letra hasta victoria o fallo = 7
        val letra = pedirycomprobar()
        // comprobar si la letra se ha utilizado y si no añadirla a letras usadas
        if (usadas.contains(letra)){
            println("La letra $letra ya la has utilizado")
            println("Las letras que has utilizado hasta ahora son $usadas")
        }else{
            usadas = usadas + letra //añadir la letra, otra forma de ponerlo usadas += letra
            if (letra in secreta){ //letra se encuentra en secreta: ACIERTO
                acierto++
                println("La letra es correcta")
            }else{
                fallo++
                println("La letra es incorrecta")
            }
        }
    }while (fallo < 7)// sale del bucle cuando falle 7 veces o cuando acierte
    // evaluar por que condiciones se ha salido con un if
}

// función en la que se pedirá las letras y se comprobará
fun pedirycomprobar(): String {
    val abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ" //creamos una variable con el abecedario para adivinar la palabra
    var seguir = true // booleano
    var letras: String
    do {
        println("Dime una letra:")
        letras = readln().uppercase()
        if (abc.contains(letras)){//letras se encuentra en abc
            println("")
            seguir = false // cuando sea falso sale del bucle
        }

    }while (seguir) // si es verdadero se vuelve hacer, tambien puede ponerse seguir == true
    return letras
}