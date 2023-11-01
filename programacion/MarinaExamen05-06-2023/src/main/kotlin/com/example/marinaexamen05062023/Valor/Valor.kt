package com.example.marinaexamen05062023.Valor

import java.lang.Exception
import java.util.*

class Valor {
    companion object{
        /*
        Primer método:
        pasar un parámetro de tipo texto, un carácter y un número
        debe devolvernos la cantidad de instancias de ese carácter en el texto que son múltiplos del número que
        pasamos por parámetro
         */
        fun revisar(texto: String, caracter: Char, numero: Int): Int{
            var contador = 0
            try {
                for (i in texto.indices) {
                    if (texto[i] == caracter && (i + 1) % numero == 0) {
                        contador++
                    }
                }
            }catch(e: Exception){
                e.printStackTrace()
            }
            return contador
        }

        /*
        Segundo método:
        tendrá un texto y dos posiciones del texto, devolverá el texto pasado por parámetro con el carácter
        cambiado de las posiciones introducidas.
         */
        fun inversa(texto: String, posicion1: Int, posicion2: Int): String{
            val caracteres = texto.toCharArray()
            try {
                for (i in caracteres.indices) {
                    if (i == posicion1) {
                        caracteres[i] = texto[posicion2]
                    } else if (i == posicion2) {
                        caracteres[i] = texto[posicion1]
                    }
                }
            }catch(e: Exception){
                e.printStackTrace()
            }
            return String(caracteres)
        }

        /*
        Tercer método:
        pasada una frase escriba cada uno de sus caracteres en una línea diferente, empezando por el final
         */
        fun escribirEnLineas(texto: String){
            try {
                for (i in texto.length - 1 downTo 0) {
                    println(texto[i])
                }
            }catch(e: Exception){
                e.printStackTrace()
            }
        }
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    var resultado = -1

    while (resultado != 2){
        println("Ingrese un texto:")
        val texto = readln()

        println("Ingrese un carácter:")
        val caracter = scanner.nextLine()[0]

        println("Ingrese un número:")
        val numero = scanner.nextInt()

        val revisar = Valor.revisar(texto, caracter, numero)
        resultado = revisar

        if (resultado != 2){
            println("El resultado no es 2. Continuando...")
        }

        println("Ingrese la posicion 1:")
        val posicion1 = scanner.nextInt()

        println("Ingrese la posicion 2:")
        val posicion2 = scanner.nextInt()

        val textoModificado = Valor.inversa(texto, posicion1, posicion2)
        println("Texto modificado: $textoModificado")

        Valor.escribirEnLineas(texto)
    }
}