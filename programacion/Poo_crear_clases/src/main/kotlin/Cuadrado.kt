class Cuadrado {
    private var lado: Int = 0 // siempre hacer privado

    fun getlado(): Int{
        return lado
    }

    fun setlado(l: Int){
        lado = l
    }

    constructor(l: Int){
        this.lado = l
    }

    constructor(){
        println("Dame el lado")
        lado = readln().toInt()
    }

    fun perimetro():Int{
        return lado*4
    }

    fun area():Int{
        return lado * lado
    }

    fun imprimirPerimetro(){
        println(lado*4)
    }

    fun imprimirArea(){
        println(lado * lado)
    }
}