/*
 Programa que indique si un número es perfecto.
 Un numero es perfecto cuando es igual a la suma de sus divisores. (sin incluirse a si mismo pero si al uno)
*/

fun main (args: Array<String>) {
    var num: Int = 0
    var i: Int = 1
    var suma: Int = 0
    var j: Int = 0

    print("Dime el número que quieras saber si es perfecto: ")
    num = readln().toInt()

    while (i <= num) {
        if (num % i == 0) { // i son los divisores. Se divide desde 1 hasta num-1
            suma += i // si es divisor se suma                   suma = suma + i
        }
        i++
    }
    if (suma == num) {
        println("El número $num es perfecto.")
    } else {
        println("El número $num no es perfecto.")
    }
}