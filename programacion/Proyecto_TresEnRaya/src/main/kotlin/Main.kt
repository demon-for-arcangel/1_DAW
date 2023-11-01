/*
3 en raya (básico, no se puede mover pieza)

2 jugadores, uno que sea el ordenador y otro que sea la persona
aleatoriamente el ordenador pondra su pieza luego el programa para que el ordenador de la opción más correcta.
 */
fun main(args: Array<String>) {
    // un tablero
    // sorteo
    // un jugador
    // máquina-> random
    // checkCasilla
    // compruebaLinea
    // imprimirTablero
    // pedirSimbolo

// Stack de variables
    val N: Int = 3
    var tablero = Array(N) { IntArray(N) { -1 } }
    var fin = false
    var count: Int = 0
    var simboloPc = 0
    var simboloHuman = 0
    var human = "x"
    var posicion = Array<Int>(2){0}
    var tiradaPC= Array<Int>(2){0}

    var ganaHuman = false
    var ganaPc = false


    // PC = 0
    // Humano = 1

    // 0 -> O
    // 1 -> X

    val ganadorSorteo = sorteo()

    if (ganadorSorteo==0){
        println("El Pc ha ganado el simbolo")
        println("Pc: Me quedo con las O")
        println("Humano: Me quedo con las X")

        simboloPc=0
        simboloHuman=1

    } else {
        println("El Humano ha ganado el simbolo")

        human=pedirSimbolo()
        simboloHuman=cashSimbolo(human)

        if (simboloHuman==1){      // 1 == x
            simboloPc = 0
        }else simboloPc = 1

        println("Pc: Me quedo con las ${cashInvertSimbolo(simboloPc)}")
        println("Humano: Me quedo con las ${cashInvertSimbolo(simboloHuman)}")

    }

    while (count<9) {
        //Pc
        println("Tirada PC:")
        tiradaPC=tiradaPC(tablero)
        setSimbolo(tablero, tiradaPC[0],tiradaPC[1],simboloPc)
        imprimirTablero(tablero)

        if (count == 0) {
            posicion = pedirPosicion(tablero)
        } else {
            posicion = pedirPosicion(tablero)
        }

        //humano
        println("Tirada Humano:")
        setSimbolo(tablero,posicion[0],posicion[1], simboloHuman)
        imprimirTablero(tablero)


       if (count<3){

            ganaPc = compruebaLinea(tablero,simboloPc)
            ganaHuman = compruebaLinea(tablero,simboloHuman)
            println("Ha ganado PC?: $ganaPc")
            println("Ha ganado Human?: $ganaHuman")
        }


        count++
        if (count == 8){
            println("Es tu última tirada")
        }
    }
    if (count == 9){
        println("pc: $ganaPc")
        println("human: $ganaHuman")
    }
}

fun imprimirTablero(tablero:Array<IntArray>){
    var i: Int = 0
    var j: Int = 0
    while (i < tablero.size){
        j = 0
        while (j < tablero.size){
            if (tablero[i][j]==-1){
                print("[ ]")
            }else
                if (tablero[i][j]==0){
                    print("[O]")
                }
                if (tablero[i][j]==1){
                    print("[X]")
                }
            j++
        }
        println()
        i++
    }
}


fun checkCasilla(tablero:Array<IntArray>,x:Int,y:Int):Boolean{
    var check = false;

    if (tablero[x][y] == 1 || tablero[x][y] == 0){
        check = true
    }

    return check
}

fun compruebaLinea(tablero: Array<IntArray>,usuario:Int):Boolean{
    var fila: Int = 0
    var columna: Int = 0
    var points = Array<Int>(3){0}

    while (fila < tablero.size){
        columna = 0
        while (columna < tablero.size){
            if (tablero[fila][columna]==usuario){
                points[0]++
} else points[0] = 0
            if (columna==fila && tablero[fila][columna]==usuario){
                points[1]++
            }else points[1]=0
            columna++
        }
        fila++

    }
    var ganador = false
    if (points[0]==3 || points[1]==3) return ganador
    else return ganador
}

fun sorteo(): Int{
    // PC = 0
    // Humano = 1

    var sorteo: Int = 0

    sorteo = (0..1).random()

    return sorteo
}

fun pedirSimbolo():String{
    var simbolo = "p"

    while((simbolo[0] != 'x') && (simbolo[0] != 'o')){
        println("Elije entre el símbolo X o el símbolo O")
        simbolo = readln().toLowerCase()
    }
    return simbolo
}

fun pedirPosicion(tablero: Array<IntArray>):Array<Int>{

    var posicion = Array<Int>(2){0}

    var x = 0   // Filas
    var y = 0   // Columnas
    var check = true

    while (x<=3 && y<=3 && check){

        println("Escriba la fila donde desea colocar su ficha")
        x = readln().toInt()
        println("Escriba la columna donde desea colocar su ficha")
        y = readln().toInt()
        x--
        y--

        check=checkCasilla(tablero,x,y)
    }
    posicion[0] = x
    posicion[1] = y
    return posicion
}

fun setSimbolo(tablero: Array<IntArray>, x:Int, y: Int, simbolo:Int){
    tablero[x][y] = simbolo
}

fun cashSimbolo(simbolo:String):Int{

    var x = 0
    if (simbolo == "X" || simbolo == "x") {
        x = 1
    }

    return x
}

fun cashInvertSimbolo(simbolo:Int):String{

    var x = "X"
    if (simbolo == 0) {
        x = "O"
    }

    return x
}

fun tiradaPC(tablero: Array<IntArray>):Array<Int>{
    var pc = Array<Int>(2){-1}
    var check = true

    while (check){
        pc[0]=(0..2).random()
        pc[1]=(0..2).random()
        check = checkCasilla(tablero, pc[0],pc[1])
    }

    return pc
}