import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    //Calcula la media de tres números
    //Se deben dar dos resultados: la media con decimales y redondeada
    var scanner = Scanner(System.`in`)
    println("Dime tres números")
    var num1 = scanner.nextFloat()
    var num2 = scanner.nextFloat()
    var num3 = scanner.nextFloat()
    var media_decimal =(num1 + num2 + num3) / 3
    var media_entera = round(media_decimal)
    println("La media decimal de estos números es $media_decimal")
    println("La media entera de estos números es $media_entera")
}