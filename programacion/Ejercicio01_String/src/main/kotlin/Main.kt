import java.util.*

fun main() {
    //Pedir dos cadenas por teclado y compararlas en longitud, alfabeticamente y si son iguales

    val sc = Scanner(System.`in`)
    var cad1: String
    var cad2: String

    println("Introduce la primera cadena")
    cad1 = sc.nextLine()

    println("Introduce la segunda cadena")
    cad2 = sc.nextLine()

    //comparación para saber si son iguales
    if (cad1.equals(cad2)){
        println("$cad1 y $cad2 son iguales")
    }else{
        println("$cad1 y $cad2 no son iguales")
    }

    //comparación de su longitud
    if (cad1.length==cad2.length){
        println("Ambas cadenas tienen la misma longitud")
    }else{
        println("No tienen la misma longitud")
    }

    //comparación alfabeticamente
    if (cad1.compareTo(cad2) == 0){
        println("Son iguales")
    }else if(cad1.compareTo(cad2) > 0){
        println("$cad1 alfabeticamente esta por delante")
    }else{
        println("$cad2 alfabeticamente esta por detrás")
    }
}