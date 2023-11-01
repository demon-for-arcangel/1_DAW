import kotlin.io.path.fileVisitor

/*
Una habitación cuadrada, los obstáculos 1/3 menor que la habitación, que entre una persona aleatoriamente por los extremos
(por los bordes) siempre que no haya un obstáculo. Cuando la persona entre en la habitación debemos hacer que recorra
la habitación entera, puede pasar por la misma casilla, pero si tiene que elegir entre una nueva y otra que ya ha pasado
debe ir a la nueva. La persona se puede desplazar en diagonal.
Representar el orden de las casillas por las que ha pasado.
Tener en cuenta que se puede quedar una casilla encerrada.



Una habitación de tamaño fijo cuadrada indicado por teclado tiene obstáculos (que se situan aleatoriamente,
se piden al inicio y no pueden superar 1/3 o 1/4 del lado de la habitación), por la que puede pasar una persona.

Una persona entrará por los lados en los que no haya obstáculos. La persona deberá recorrer todas las casillas,
puede entrar en casillas que ya han sido pisadas, pero en el caso de que pueda elegir entre una casilla nueva y una ya pisada,
eligirá la nueva. Puede andar en diagonal.

Al final, se presentarán las coordenadas de cada casilla en el orden que ha pasado el usuario.

 */

fun main(args: Array<String>) {
    println("¿De que tamaño quiere la habitación?")

    val sizeRoom = readln().toInt();
    var arrAux = Array<Int>(2) { 0 }
    val stop = 0.33 * sizeRoom * sizeRoom
    var count = 0
    var obstaculoX = 0;
    var obstaculoY = 0;
    val room = Array(sizeRoom) { IntArray(sizeRoom) { 0 } }

    while (count <= stop) {
        obstaculoX = obstaculos(room)
        obstaculoY = obstaculos(room)
        room[obstaculoX][obstaculoY] = -1
        count++
    }

    println("Obstaculos")
    printRoom(room)
    println("Acceso:")
    arrAux = acceder(room)
    printRoom(room)

    println("Recorrido")
    recorrerRoom(room, arrAux)
    printRoom(room)


    /*
    *
    * [0.0][0.1][0.2][0.3]
    * [1.0][1.1][1.2][1.3]
    * [2.0][2.1][2.2][2.3]
    * [3.0][3.1][3.2][3.3]
    *
    * */


}


fun obstaculos(arr: Array<IntArray>): Int {
    var num = (0..(arr.size - 1)).random()
    return num
}

fun printRoom(room: Array<IntArray>) {
    var fila: Int = 0
    var columna: Int = 0
    while (fila < room.size) {
        columna = 0
        while (columna < room[fila].size) {
            print("[${room[fila][columna]}]")
            columna++
        }
        println()
        fila++
    }
}

fun acceder(room: Array<IntArray>): Array<Int> {
    var fila: Int = 0
    var columna: Int = 0
    var i = 1
    var salir = true
    while (fila < room.size && salir) {
        columna = 0
        while (columna < room[fila].size && salir) {
            if (room[fila][columna] != -1) {
                if (columna == 0 || fila == 0 || columna == (room[fila].size - 1) || fila == (room[fila].size - 1)) {
                    room[fila][columna] = i
                    i++
                    salir = false
                }
            }
            columna++
        }
        fila++
    }
    var arrAux = Array<Int>(2){0}
    fila--
    columna--
    arrAux[0]=fila
    arrAux[1]=columna
    return arrAux
}

fun recorrerRoom(room: Array<IntArray>, arrAux: Array<Int>) {
    var fila: Int = arrAux[0]
    var columna: Int = arrAux[1]

    var i = 1
    while (fila < room.size) {
        if (i == 1 ) columna = arrAux[1]
        else columna = 0
        while (columna < room[fila].size) {
            if (room[fila][columna]!=-1){
                room[fila][columna]=i
                i++
            }
            columna++
        }
        fila++
    }
}