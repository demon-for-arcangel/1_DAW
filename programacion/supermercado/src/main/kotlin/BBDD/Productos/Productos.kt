package BBDD.Productos

class Productos {
    var cod_prod: Int = 0
    var cod_cat: Int = 0
    var nombre: String = ""
    var cant: Int = 0
    var precio: Int = 0

    constructor(codProd: Int, codCat: Int, nom: String, cant: Int, precio: Int){
        cod_prod = codProd
        cod_cat = codCat
        nombre = nom
        this.cant = cant
        this.precio = precio
    }

    override fun toString(): String {
        return " $nombre "
    }
}