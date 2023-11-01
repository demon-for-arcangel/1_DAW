/*
Leer dos matrices 3x3 y obtener una tercera matriz correspondiente a la suma de las dos matrices
 */

fun main(args: Array<String>) {
    val N: Int = 3
    var matriz1 = Array(N){IntArray(N)}
    var matriz2 = Array(N){IntArray(N)}
    var resultado = Array(N){IntArray(N)}

// matriz 1
    var i: Int = 0
    var j: Int = 0
    while (i < matriz1.size){
        j = 0
        while (j < matriz1.size) {
            matriz1[i][j] = i + j
            j++
        }
        i++
    }

//matriz 2
    i = 0
    j = 0
    while (i < matriz2.size){
        j = 0
        while (j < matriz2.size) {
            matriz2[i][j] = i + 2
            j++
        }
        i++
    }

// Recorrer las dos matrices y sumarlas
    i = 0
    while (i < matriz1.size){
        j = 0
        while (j < matriz2.size){
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
            j++
        }
        i++
    }

// imprimir resultado por pantalla
    i = 0
    while (i < resultado.size){
        j = 0
        while (j < resultado.size){
            print("[${resultado[i][j]}]")
            j++
        }
        println()
        i++
    }
}