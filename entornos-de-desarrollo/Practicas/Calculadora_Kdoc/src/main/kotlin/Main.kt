/**
 * Main
 *
 * @param args
 */
fun main(args: Array<String>) {

    var continuar = true
    while (continuar){
        println("Ingrese la operación que desea realizar.")
        println("Suma, resta, multiplicación o división.")
        val operacion: String = readln()
        if (operacion != null){
            when (operacion){
                "suma" -> {
                    val num1 = solicitarNum()
                    val num2 = solicitarNum()
                    println("La suma de $num1 y $num2 es: ${num1 + num2}")
                }
                "resta" -> {
                    val num1 = solicitarNum()
                    val num2 = solicitarNum()
                    println("La resta de $num1 y $num2 es: ${num1 - num2}")
                }
                "multiplicacion" -> {
                    val num1 = solicitarNum()
                    val num2 = solicitarNum()
                    println("La multiplicación de $num1 y $num2 es: ${num1 * num2}")
                }
                "división" -> {
                    val num1 = solicitarNum()
                    val num2 = solicitarNum()
                    println("la división de $num1 y $num2 es: ${num1 / num2}")
                } else -> {
                println("No es posible dividir entre cero.")
            }
            }
        }else{
            println("Operación no válida, por favor introduzca de nuevo.")
        }
        continuar = solicitarContinuar()
    }
}

/**
 * Solicitar num
 *
 * @return
 */
fun solicitarNum(): Double{
    print("Ingrese un número: ")
    val numero = readln()
    return if (numero != null){
        numero.toDouble()
    } else {
        0.0
    }
}

/**
 * Solicitar continuar
 *
 * @return
 */
fun solicitarContinuar(): Boolean{
    print("¿Desea continuar? (s/n)")
    val respuesta = readln()
    return respuesta == "s"
}