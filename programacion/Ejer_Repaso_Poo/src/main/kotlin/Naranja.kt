class Naranja {
    var color: String = ""
    var diametro: Int = 0
       /* get(): Int{ //para modificar los get y los set que nos da kotlin debe estar debajo de su atributo
            return field * 2 // se hace referencia a diametro como field.
        }
          set(value: Int){
            field = value + 2
          }
        */
    var sabor: Boolean = false

    /*ASI SE HARIA SI USAMOS EL PRIVATE.
    fun getDiametro(): Int{
        return diametro*2
    }
     */

    override fun toString(): String {
        return "Naranja(color='$color', diametro=$diametro, sabor=$sabor)"
    }

    fun pelar(d: Int){
        if (d > diametro){
            println("Necesito el cuchillo grande")
        }else{
            println("Necesito el cuchillo pequeño")
        }
    }

    fun pelar(){
        if(sabor == true){
            pelar(5)
        }
    }
}