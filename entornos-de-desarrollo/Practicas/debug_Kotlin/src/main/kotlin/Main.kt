fun main(args: Array<String>) {
    val MEDIA:Int = 5
    var cola= Array<Int>(15){0}
    var personasPorTurno: Int = 15
    var turno: Int = 1
    var nombre: String = "Marina"
    while(turno<MEDIA){
        println(texto(4) + turno)
        rellenarCola(personasPorTurno,cola)
        personasPorTurno=3
        println( texto(2)+ personasPorTurno)
        avanzarCola(personasPorTurno, cola)
        turno ++
    }


}
fun limites(i:Int):Int{
    var n:Int=0
    when (i){
        1 -> n = 1
        3 -> n = 5
        9 -> n = 19
    }
    return n
}
fun texto(i:Int):String{
    var s:String=""
    when (i){
        1 -> s = "Cola esperando turno"
        2 -> s="   Personas atendidas en este turno: "
        3 -> s="Cola con los huecos generados"
        4 -> s="Turno "
        5 -> s="["
        6 -> s="]"
        7 -> s = "     "
    }
    return s
}
fun avanzarCola(cantidad:Int, v: Array<Int>){
    var i:Int = (v.size-1) - cantidad
    while (i>=0){
        v[i+cantidad]= v[i]
        i--;
    }
    i=0
    while (i< cantidad){
        v[i]= 0
        i++;
    }
}
fun rellenarCola(cantidad: Int,v:Array<Int>){
    // cantidad es el numero de elementos a rellenar, se restaran a la longitud total
    //y desde esa posición se rellenara
    var i:Int = 0

    while (i<cantidad){
        v[i]= (limites(1)..limites(9)).random()
        i++;
    }
}
