import java.util.*

fun main(args: Array<String>) {
    //Calcula la superficie y el perímetro de un rectángulo
    var scanner = Scanner(System.`in`)
    println("Dame el largo")
    var largo = scanner.nextInt()
    println("Dame el ancho")
    var ancho = scanner.nextInt()
    var superficie = largo * ancho
    var perimetro = 2 * largo + 2 * ancho
    println("La superficie es $superficie")
    println("El perímetro es $perimetro")
}