import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    //Calcula el área y la circunferencia de un círculo
    var scanner = Scanner(System.`in`)
    println("Dame el radio")
    var radio = scanner.nextInt()
    var area = PI * radio * radio
    var perimetro = 2 * PI * radio
    println("El área es $area")
    println("El perímetro es $perimetro")
}