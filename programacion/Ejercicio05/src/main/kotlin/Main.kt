import java.util.*

fun main(args: Array<String>) {
    //Determinar si un número es positivo o negativo
    var scanner = Scanner(System.`in`)
    println("Dime un número")
    var numero = scanner.nextInt()
    if (numero > 0) {
        println("El número " + numero + " es positivo")
    }else{
        println("El número " + numero + " es negativo")
    }
}