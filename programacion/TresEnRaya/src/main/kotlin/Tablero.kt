class Tablero {
    private var simbolo = "X"
    var casilla = Array<Int>(2){0}

    constructor(){}
    constructor(simbolo:String,casilla:Array<Int>){}

    fun getSimbolo():String{
        return simbolo
    }

    fun setSimbolo(simbolo: String){
        this.simbolo=simbolo
    }

    fun moverFicha(x:Int,y:Int,tablero: Array<IntArray>,jugador:Int){
        var check = checkMov(x,y,tablero)
        if (check){
            tablero[x][y]=jugador
        }
    }

    fun checkMov(x: Int,y:Int,tablero: Array<IntArray>):Boolean{
        var check = false
        if (tablero[x][y]>=0){
            check = true
        }

        return check
    }

    fun checkLinea(tablero: Array<IntArray>,jugador:Int):Boolean{
        var fila = 0
        var columna = 0
        var points = Array<Int>(3){0}

        while(fila<tablero.size){
            columna=0
            while (columna<tablero.size){
                if (tablero[fila][columna]==jugador){
                    points[0]++
                } else points[0] = 0
                if (columna==fila && tablero[fila][columna]==jugador){
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

    override fun toString(): String {
        return "Tablero(simbolo='$simbolo', casilla=${casilla.contentToString()})"
    }

}