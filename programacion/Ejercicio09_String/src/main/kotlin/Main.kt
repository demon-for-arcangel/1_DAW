/*
Escribir un programa que cuente el número de palabras en un texto
 */

fun main(args: Array<String>) {
    var palabra: Int = 1
    var i: Int = 0
    println("Introduce el texto del que deseas saber la cantidad de palabras:")
    var texto: String = readln()
    val space = texto.trim() //eliminar los posibles espacios en blanco al principio y final

    if (space.isEmpty()){ //si la cadena esta vacía
        palabra = 0
    }else{
        i = space.indexOf(" ") //buscar el primer espacio vacío
        while (i != -1){ //bucle que se hace mientras se encuentra un espacio en blanco
            palabra++ //se suma otra palabra
            i = space.indexOf(" ", i + 1) //buscar siguiente espacio en blanco
        }
    }
    println("El texto tiene $palabra palabras")
}