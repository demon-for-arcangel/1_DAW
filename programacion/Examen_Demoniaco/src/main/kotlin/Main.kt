import kotlin.math.pow

fun main(args: Array<String>) {
    val MENOR: Int = 2
    val MAYOR: Int = 7
    var numero: Int = 0
    var porCiento: Int = 0
    var contar = Array<Int>(2){0} //en la posición [0] contamos demonios// .
    var cifras: Int = (MENOR.. MAYOR).random()
    println("Los numeros que vamos a generar son de máximo ${cifras}")
    do{
        numero = generarNumero(cifras)
        porCiento = calcularPorCiento(numero.toString())
        println("${numero} --> Demoniaco en un ${porCiento}%")
        contarTipos(porCiento, contar)
    }while (porCiento < 75)
    println ("FIN")
    println("Demoniacos: " + contar[0])
    println("No Demoniacos: ${contar[1]}")
}

fun contarTipos(c: Int, v: Array<Int>){
    if (c > 0) v[0] = v[0]+1 // si el if solo tiene una instrucción se puede poner sin llaves
    else v[1] = v[1] + 1
}

fun calcularPorCiento(n: String): Int{ //
    var contarSeis: Int = 0
    for (i in n){ //While (i<n.length)
        if (i.equals('6')){ // if (n[i].equals('6')
            contarSeis++
        }
    }
    return ((contarSeis * 100) / n.length)
}

fun generarNumero(c: Int): Int{
    return (10 .. potencia(c)).random() // se necesita que sea de tipo int
}

fun potencia(c: Int): Int{
    var solucion: Int = 1
    var i: Int = 1
    while (i <= c){
        solucion = solucion * 10
        i++
    }
    return (solucion-1)
}