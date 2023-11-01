import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var salida: Int
    var cont = 0
    var num: Int

    do{
       var aleatorio = Random.nextInt(1, 100)
        do{
            cont--
            println("Escribe un número entre el 1 y el 100, intento número" + cont)
            num = scanner.nextInt()
            if (aleatorio == num){
                println("HAS ACERTADO")
                cont = 0
            }else{
                if (aleatorio < num) {
                    println("$num es mayor que el número que debes adivinar")
                }else{
                   println("$num es menor que el número que debes adivinar")
                }
            }
        }while (cont != 0)
        if (aleatorio != num){
            println ("HAS PERDIDO")
        }
        cont = 5
        println("¿Quieres seguir jugando?")
        salida = scanner.nextInt()
    }while (salida == 1)

}