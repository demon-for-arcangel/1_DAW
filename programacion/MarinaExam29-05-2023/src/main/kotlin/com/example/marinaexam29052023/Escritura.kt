package com.example.marinaexam29052023

import java.lang.StringBuilder

class Escritura {
    companion object { //estatico
        fun contar(texto: String, caracter: String): Int {
            var contador: Int = 0
            try {
                for (i in texto) {
                    if (caracter[0] == i) { //caracter: Char --> caracter == i
                        contador++
                    }
                }
            }catch(e: Exception){
                e.printStackTrace()
            }
            return contador
        }

        fun cambio(texto: String, caracterOriginal: Char, caracterNuevo: Char): String {
            var textoNuevo = ""

            return (texto.replace(caracterOriginal, caracterNuevo))
           /*
            try {
                for (i in texto.indices) {
                    if (texto[i] == caracterOriginal[0]) {
                        textoNuevo = textoNuevo + caracterNuevo
                    }else{
                        textoNuevo = textoNuevo + texto[i]
                    }
                }
            }catch (e: Exception){
                e.printStackTrace()
            }
            return textoNuevo */
        }

        fun escribirCaracter(texto: String) {
            try {
                for (caracter in texto) {
                    println(caracter)
                }
            }catch(e: Exception){
                e.printStackTrace()
            }
        }
    }
}

fun main(){
    print("Dame un texto:")
    var texto: String = readln()
    print("Dime el caracter para contar en el texto:")
    var caracter: String = readln()

    val cantidad = Escritura.contar(texto, caracter)
    println("El carácter '$caracter' aparece $cantidad veces en el texto.")
    val escribirCaracter = Escritura.escribirCaracter(texto)
}