package BaseDatos

import java.time.LocalDate

class Alumnado {
    var id:Int=0
    var nombre:String="PERICO"
    var edad:Int = 0
    var fechaNacimiento= LocalDate.now()
    var matriculado:Boolean = false
    var fechaString: String=""

    constructor(){}

    constructor(i:Int,n:String,e:Int,f:LocalDate,m:Boolean,fs:String){
        this.id = i
        this.nombre = n
        edad = e
        fechaNacimiento = f
        matriculado= m
        fechaString=fs
    }
    constructor(i:Int,n:String,e:Int,f:LocalDate,m:Boolean){
        this.id = i
        this.nombre = n
        edad = e
        fechaNacimiento = f
        matriculado= m
    }
    override fun toString(): String {
        return "Alumnado(nombre='$nombre', edad=$edad, fechaNacimiento=$fechaNacimiento, matriculado=$matriculado)"
    }


}