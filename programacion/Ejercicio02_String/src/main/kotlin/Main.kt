/*
Solicitar al usuario la introducción de una cadena de caracteres
devolver esta cadena invertida
convertirla en mayúsculas
 */


import java.util.*

fun main(args: Array<String>) {
    var cadena: String
    var cadena_invertida: String

    println("Introduce una frase:")
    cadena = readLine().toString()

    cadena_invertida = cadena.reversed() //invertimos la cadena
    cadena_invertida = cadena_invertida.uppercase() //convertimos la cadena en mayúsculas
    println("La frase invertida es $cadena_invertida")
}