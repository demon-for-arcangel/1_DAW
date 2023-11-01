import java.util.*

fun main(args: Array<String>) {
    var salida: Int
    val scanner= Scanner(System.`in`)
    var operacion: Int
    var num1: Int
    var num2: Int
    var resultado = 0
    var inf: Int

    do{
        inf = 0
        println("Introduce el primer número")
        num1 = scanner.nextInt()
        println("Introduce el segundo número")
        num2 = scanner.nextInt()
        println("Introduce la operación que desea realizar")
        println("Sumar = 0")
        println("Restar = 1")
        println("Multiplicar = 2")
        println("Dividir = 3")
        operacion = scanner.nextInt()

            when (operacion) {
                0 -> resultado = num1 + num2
                1 -> resultado = num1 - num2
                2 -> resultado = num1 * num2
                3 -> if (num2 == 0){
                    inf = 1
                }else{
                    resultado = num1 / num2
                }
                else -> {
                    println("Número no valido")
                }
            }
        if (inf == 0){
            println("El resultado es " + resultado)
        }else{
            println("El resultado es infinito")
        }
        println("Quieres seguir usando la calculadora? 0 = No 1 = Sí")
        salida = scanner.nextInt()
    }while (salida == 1)
}