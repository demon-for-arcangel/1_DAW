fun main() {
    println("Dime el dividendo")
    val dividendo: Int = readln().toInt()
    println("Dime el divisor")
    val divisor: Int = readln().toInt()

    var cociente: Int = 0
    var resto: Int = 0

    var a = 1
    var b = 1

    while (0 < a) {
        if (0 < a){
            a = dividendo - divisor * b
            cociente++
        }
        if (0 > a){

        }
    }
    println("El cociente es $cociente y el resto es $a")
}