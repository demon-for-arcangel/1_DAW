class Reloj {
    //private var modo: Int = 0 //12 o 24 horas
    private var horas: Int = 0
    private var minutos: Int = 0
    private var segundos: Int = 0

    fun gethoras(): Int{
        return horas
    }

    fun sethoras(h: Int){
        this.horas = h
    }

    fun getminutos(): Int{
        return minutos
    }

    fun setminutos(m: Int){
        this.minutos = m
    }

    fun getsegundos(): Int{
        return segundos
    }

    fun setsegundos(s: Int){
        this.segundos = s
    }

    constructor(h: Int, m: Int, s: Int){
        this.horas = h
        this.minutos = m
        this.segundos = s
    }

    constructor(){
        println("Dame la hora")
        this.horas = readln().toInt()
        println("Dame los minutos")
        this.minutos = readln().toInt()
        println("Dame los segundos")
        this.segundos = readln().toInt()
    }
}