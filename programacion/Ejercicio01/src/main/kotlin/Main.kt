import java.util.*

fun main(args: Array<String>) {
    //Calcula la superficie y el perímetro de un cuadrado
    println("¿Me das el lado del cuadrado?")
    var scanner = Scanner(System.`in`)
    var lado = scanner.nextInt()
    var area=lado+lado
    println("El área es $area")
}