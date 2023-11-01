fun main(args: Array<String>) {

    var continuar = true
    while (continuar){
        println("Ingrese la operación que desea realizar.")
        println("Suma, resta, multiplicación o división.")
        val operacion: String = readln()
        if (operacion != null){

            when (operacion){
                "suma" -> {
                    println("La suma es: " + suma())
                }
                "resta" -> {
                    println("La resta es: " + resta())
                }
                "multiplicacion" -> {
                    println("La multiplicación es: " + multiplicacion())
                }
                "división" -> {
                    println("la división es: " + division())
            }
            }
        }else{
            println("Operación no válida, por favor introduzca de nuevo.")
        }
        continuar = solicitarContinuar()
    }
}

fun suma(): Double{
    val num1 = solicitarNum()
    val num2 = solicitarNum()
    var resultado: Double = 0.0

    resultado = num1 + num2
    return resultado
}

fun resta(): Double{
    val num1 = solicitarNum()
    val num2 = solicitarNum()
    var resultado: Double = 0.0

    resultado = num1 - num2
    return resultado
}

fun multiplicacion(): Double{
    val num1 = solicitarNum()
    val num2 = solicitarNum()
    var resultado: Double = 0.0

    resultado = num1 * num2
    return resultado
}

fun division(): Double{
    val num1 = solicitarNum()
    val num2 = solicitarNum()
    var resultado: Double = 0.0

    if (num1 != 0.0 || num2 != 0.0){
        println("Es imposible dividir entre cero")
    }else{
        resultado = num1 / num2
    }
    return resultado
}

fun solicitarNum(): Double{
    print("Ingrese un número: ")
    val numero = readln()
    return if (numero != null){
        numero.toDouble()
    } else {
        0.0
    }
}

fun solicitarContinuar(): Boolean{
    print("¿Desea continuar? (s/n)")
    val respuesta = readln()
    return respuesta == "s"
}