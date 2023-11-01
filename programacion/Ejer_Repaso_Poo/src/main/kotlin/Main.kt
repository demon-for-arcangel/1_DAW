fun main(args: Array<String>) {
    var valenciana = Naranja() //crea una copia de naranja (no cambia los valores) y la llama valenciana
    println(valenciana) //es lo mismo que valenciana.toString() se pone cuando no está el metodo toString en la clase
    valenciana.diametro = 7 //setDiametro(7)
    valenciana.color = "rojo" //set("rojo")
    println(valenciana)
    //var micolor = valenciana.color //getColor()
    //println(micolor)

    val N: Int = 5000
    var pale = arrayOfNulls<Naranja>(N) //crear un array
    for (i in pale.indices){ // (i in 0..pale.size-1)
        pale[i] = Naranja()
    }
    for (i in pale.indices){
        println(pale[i].toString())
    }
}