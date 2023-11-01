package com.example.examenzombie.Escritura

import java.util.*

class Escritura {
    companion object{
        fun contar(texto: String, caracter: Char): Int{
            var contador = 0
            try {
                for (i in texto) {
                    if (i == caracter) {
                        contador++
                    }
                }
            }catch(e: Exception){
                e.printStackTrace()
            }
            return contador
        }

        fun cambio(texto: String, caracterOriginal: Char, caracterNuevo: Char): String{
            return texto.replace(caracterOriginal, caracterNuevo)
        }

        fun escribirEnLineas(frase: String){
            try {
                for (i in frase) {
                    println(i)
                }
            }catch(e: Exception){
                e.printStackTrace()
            }
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    var texto: String
    var caracter: Char
    var contador: Int = 0

    while (contador != 8) {
        println("Ingrese un texto:")
        texto = scanner.nextLine()

        println("Ingrese un carácter:")
        caracter = scanner.nextLine()[0]

        contador = Escritura.contar(texto, caracter)
        println("Cantidad de instancias del carácter '$caracter' en el texto: $contador\n")

        if (contador != 8) {
            println("Ingrese cualquier tecla para continuar o 'q' para salir:")
            val opcion = scanner.nextLine()
            if (opcion == "q") {
                break
            }
        }

        println("Ingrese un carácter original:")
        val caracterOriginal = scanner.nextLine()[0]

        println("Ingrese un carácter nuevo:")
        val caracterNuevo = scanner.nextLine()[0]

        val textoCambiado = Escritura.cambio(texto, caracterOriginal, caracterNuevo)
        println("Texto con el carácter '$caracterOriginal' cambiado por '$caracterNuevo': $textoCambiado\n")

        println("Escribiendo cada caracter de la frase en una línea:")
        Escritura.escribirEnLineas(texto)
        println()
    }

    println("¡Programa terminado!")
}