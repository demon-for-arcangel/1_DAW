fun main(args: Array<String>) {
    val N: Int = 3
    var matriz1 = Array(N){IntArray(N)}
    var matriz2 = Array(N){IntArray(N)}
    var resultado = Array(N){IntArray(N)}

    rellenarMatriz(matriz1, 5)
    // imprimirMatriz(matriz1)
    rellenarMatriz(matriz2, 7)
    // imprimirMatriz(matriz2)
    sumarDosMatrices(matriz1, matriz2, resultado)
    imprimirMatriz(resultado)

    // sumarDosMatrices(resultado, matriz2, matriz1)  Cambiar el orden de la suma
    // imprimirMatriz(matriz1)
}

fun rellenarMatriz (m:Array<IntArray>, suma: Int){
    var i: Int = 0
    var j: Int = 0
    while (i < m.size){
        j = 0
        while (j < m.size) {
            m[i][j] = i + suma
            j++
        }
        i++
    }
}

fun sumarDosMatrices (m:Array<IntArray>, n:Array<IntArray>, r:Array<IntArray>){
    var i: Int = 0
    var j: Int = 0
    while (i < m.size){
        j = 0
        while (j < n.size){
            r[i][j] = m[i][j] + n[i][j]
            j++
        }
        i++
    }
}

fun imprimirMatriz (m:Array<IntArray>) {
    var i: Int = 0
    var j: Int = 0
    while (i < m.size) {
        j = 0
        while (j < m.size) {
            print("[${m[i][j]}]")
            j++
        }
        println()
        i++
    }
}