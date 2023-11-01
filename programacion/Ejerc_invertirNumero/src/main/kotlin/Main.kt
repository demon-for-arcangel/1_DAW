import java.util.*

//Función principal
fun main() {
    val numero = pedir_numero()
    val numero_invertido = invertir_numero(numero)
}

//Funciones
fun pedir_numero(): Int{
    val sc = Scanner(System.`in`)
    var numero: Int
    var dentro_rango = false
    do{
        println("Dime un número entre 10000 o 100000")
        numero = sc.nextInt()
        dentro_rango = numero in 10000 .. 100000
    } while (!dentro_rango)
    return numero
}

fun invertir_numero(numero : Int): Int {
    var num = numero
    var cero: Int
    var invertido = 0
    if (num % 10 == 0) {
        print("0")
    }
    while (num != 0) {
        val digit: Int = num % 10
        invertido = invertido * 10 + digit
        num /= 10
    }
    println("$invertido")
    return invertido
}
