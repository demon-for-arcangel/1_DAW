fun main(args: Array<String>) {
    var n : Int = 7
    var d : Int = 2
    var re : Float = 0f
    var ff : Double = 8.0
    var resultado : Int = 0

    resultado = n % d
    println("División en módulo $n entre $d = $resultado")
    println("División en módulo " + n + " entre " + d + " = " + resultado ) //Otra forma para imprimir por teclado (Concatenar)
    resultado = n / d
    println("División entera $n entre $d = $resultado")
    re = n.toFloat() / d // Convertir la variable Int en Float, si pasamos de float a int perderemos informacion (decimales)
    println("División real $n entre $d = $re")
}