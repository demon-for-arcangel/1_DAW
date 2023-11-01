/*
Crear un array de un array de 3x3
Meterle datos y mostrarlos por pantalla
 */

fun main(args: Array<String>) {
    var arr = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    var fila: Int = 0
    var columna: Int = 0
    // val uno: Int = 3
    // val dos: Int = 3


    while (fila < arr.size){ // para las matrices cuadradas nos sirve el .size
        columna = 0
        while (columna < arr.size){
            print("${arr[fila][columna]}")
            columna++
        }
        fila++
        println()
    }
   /* for (row in arr) {
        println(row.contentToString())
    }
    */
}
