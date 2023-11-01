/*
Programa que genere un vector con numeros al azar que oscilan entre [-100 y 100]
despues realizar un modulo que indique cuantos numeros positivos y negativos hay.
 */
/*
Crear vector
fun rellenar ()
    bucle generar aleatorio
fun ContarPosNeg ()
    var positivo
    var negativo
    imprimir
 */

import kotlin.random.Random

fun main(args: Array<String>) {
    val N = 3
    var numeros: Array<Int> = Array(N){0}
}

fun rellenar(n:Array<Int>){
    n = arrayOf(Random.nextInt(-100, 100))
}

fun ContarPosNeg(){
    var positivo: String
    var negativo: String
}