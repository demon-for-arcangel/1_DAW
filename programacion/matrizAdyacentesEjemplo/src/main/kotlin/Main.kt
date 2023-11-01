// Int (clase de entero) int (clase primitiva de entero)
fun main(args: Array<String>) {
    // matriz rellena de 5x5
    //var m = arrayListOf(IntArray(5){0})
    // var m2 = Array(5){Array<Int>(5){0}} // admite cualquier cosa y en el <Int> le digo que puede admitir int
    val N: Int = 5
    var m3 = Array(N){IntArray(N){0}}// admite solo int (IntArray)
    rellenarMatriz(m3) // manda m3 a la función
    imprimirMatriz(m3)

    var f: Int = 0
    var c: Int = 0
    var f_aux: Int
    var c_aux: Int

    println(m3[f][c])
    var i: Int = -1
    var j: Int = -1
    while (i < 2){
        j = -1
        while (j < 2){
           // println("i:" + i + ", j:" + j)
            //f_aux = f + i
           // c_aux = c + j
            if (!(i == 0 && j == 0)){ // cuando no quiere hacerlo, cuando i y j sean distintas de 0 se imprime
                f_aux = f + i
                c_aux = c + j
                if ((f_aux >= 0 && f_aux < m3.size) && (c_aux >= 0 && c_aux < m3.size)){
                    print("[" + m3[f_aux][c_aux] + "] ")
                }else{
                    println("ERROR")
                }
            }
            j++
        }
        i++
    }
}

fun rellenarMatriz(m: Array<IntArray>){ //no hay que especificar el tamaño porque lo coge de la matriz original m3
    var i: Int = 0
    var j: Int = 0
    while (i < m.size){
        j = 0
        while(j < m[i].size){
            //aquí es donde se recorre todo
            m[i][j] = (1..9).random()
            j++
        }
        i++
    }
}

fun imprimirMatriz(m: Array<IntArray>){
    for (row in m) { //coge las filas de la matriz
        println(row.contentToString())
    }
}