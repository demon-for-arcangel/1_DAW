class Cuadrado2 {
    private var lado: Int = 0
    private var perimetro: Int = 0
    private var area: Int = 0

    constructor(l: Int){
        this.lado = l
        perimetro = l*4
        area = l*l
    }

    fun getlado(): Int{
        return lado
    }

    fun setlado(l: Int){
        lado = l
    }

    fun getarea(): Int{
        return area
    }

    fun setarea(){

    }

    fun getperimetro(): Int{
        return perimetro
    }

    fun setperimetro(){

    }
}