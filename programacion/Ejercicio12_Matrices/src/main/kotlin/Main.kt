/*
Transponer la matriz A de orden NxN
Guardar el resultado en la matriz B
Repetir ejercicio con solo la matriz A
 */

fun main(args: Array<String>) {
    val N: Int = 4
    var a = Array(N){IntArray(N)}

    rellenar (a)
    imprimirMatriz (a)
    transponerMatriz(a)
    println()
    imprimirMatriz(a)

}

fun rellenar (a: Array<IntArray>){
    for (i in a.indices){
        for (j in a.indices){
            a[i][j]=(0..9).random()
        }
    }
}

fun imprimirMatriz(a: Array<IntArray>){
    var fila: Int = 0
    var columna: Int = 0
    while (fila < a.size){
        columna = 0
        while (columna < a.size){
            print("[${a[fila][columna]}]")
            columna++
        }
        println()
        fila++
    }
}

fun imprimirMatriz2 (a: Array<IntArray>){
    for (i in a.indices){
        for (j in a.indices){
            print("[${a[i][j]}]")
        }
    }
    println()
}

fun transponerMatriz (a: Array<IntArray>){
    var i = 0
    var j = 0
    var aux:Int = 0
    while (j < a.size){
        j=i
        while (j < a[0].size) {
            aux = a[i][j]
            a[i][j] = a[j][i]
            a[j][i] = aux
            j++
        }
        i++
    }
}

