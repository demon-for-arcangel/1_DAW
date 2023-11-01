fun resta(x1: Int, y1: Int, z1: Int){
    println("\nLa suma es: " + ((x1 + y1) - z1))
    //var suma: Int = 0
    //var resta: Int = 0
    // suma = x1 + y1
    //resta = suma - z1
    //println("\nLa suma es: $resta)
}

fun restaRetorno(x1: Int, y1: Int, z1: Int){
    var suma: Int = 0
    var resta: Int = 0
    suma = x1 + y1
    resta = suma - z1
    return resta
    //return ((x1+y1)-z1)
}