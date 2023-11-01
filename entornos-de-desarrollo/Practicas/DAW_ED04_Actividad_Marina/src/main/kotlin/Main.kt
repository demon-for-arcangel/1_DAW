
import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    var m = Array(4) { Array<Int>(4) { Random.nextInt(1, 9)} }
    var sumaFilas = Array(m.size){0}
    var sumaColum = Array(m[0].size){0}


    mostrarMatriz(m)
    var f: Int = 0
    var c: Int = 0

    sumarFilas(f, m, c, sumaFilas)

    sumaColumnas(m,sumaColum)
    println("La suma de las filas es")
    println(Arrays.toString(sumaFilas))
    println("La suma de las columnas es")
    println(Arrays.toString(sumaColum))



}

private fun sumarFilas(
    f: Int,
    m: Array<Array<Int>>,
    c: Int,
    sumaFilas: Array<Int>
) {
    var f1 = f
    var c1 = c
    while (f1 < m.size) {
        while (c1 < m[0].size) {
            sumaFilas[f1] += m[f1][c1]
            c1++
        }
        c1 = 0
        f1++
    }
}


fun sumaColumnas (m:Array<Array<Int>>, sumaColumnas:Array<Int>){
    var f: Int = 0
    var c: Int = 0

    while (c < m.size){
        while (f < m[0].size){
            sumaColumnas[c] += m[f][c]
            f++
        }
        f = 0
        c++
    }
}



fun mostrarMatriz(m:Array<Array<Int>>){
    for (f in m.indices){
        for (c in m[f].indices){
            print("${m[f][c]} ")
        }
        println()
    }
}
