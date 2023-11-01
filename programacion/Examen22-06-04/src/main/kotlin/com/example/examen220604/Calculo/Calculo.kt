package com.example.examen220604.Calculo

import com.example.examen220604.Calculo.Calculo.Companion.Contar
import com.example.examen220604.Calculo.Calculo.Companion.ContarDigitosParesImpares
import java.util.*

class Calculo {
    companion object{
        fun ContarDigitosParesImpares(numero: Int): Pair<String, String> {
            var pares = ""
            var impares = ""

            val digitos = numero.toString().toCharArray()
            for (digito in digitos) {
                val valor = digito - '0'
                if (valor % 2 == 0) {
                    pares += valor.toString() + " "
                } else {
                    impares += valor.toString()
                }
            }

            return Pair(pares.trim(), impares)
        }

        fun SumarDigitos(numero: Int): Int{
            var suma = 0
            var n = numero

            while (n != 0) {
                suma += n % 10
                n /= 10
            }
            return suma
        }

        fun ObtenerMayorSuma(numero1: Int, numero2: Int): Int{
            val sumaDigitos1 = SumarDigitos(numero1)
            val sumaDigitos2 = SumarDigitos(numero2)

            return if (sumaDigitos1 > sumaDigitos2){
                sumaDigitos1
            }else{
                sumaDigitos2
            }
        }

        fun esPrimo(numero: Int): Boolean {
            try{
                if (numero <= 1) {
                    return false
                }

                for (i in 2 until numero) {
                    if (numero % i == 0) {
                        return false
                    }
                }
            }catch(e: Exception){
                e.printStackTrace()
            }
            return true
        }
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("Ingrese un número:")
    val numero = scanner.nextInt()

    val (pares, impares) = ContarDigitosParesImpares(numero)
    println("Dígitos pares: $pares")
    println("Dígitos impares: $impares")

    println("Ingrese dos números para sumar sus dígitos y obtener el mayor:")
    val numeroSumar1 = scanner.nextInt()
    val numeroSumar2 = scanner.nextInt()
    val mayorSuma = Calculo.SumarDigitos(numeroSumar1, numeroSumar2)
    println("Mayor suma de dígitos: $mayorSuma")

    println("Ingrese un número para verificar si es primo:")
    val numeroPrimo = scanner.nextInt()
    val esPrimo = Calculo.Primo(numeroPrimo)
    println("Es primo: $esPrimo")
}