class Ordenador {
    private var marca: String = ""
    private var modelo: String = ""
    private var procesador: String = ""
    private var ram: Int = 0
    private var memoria: Int = 0

    constructor(marca: String, modelo: String, procesador: String, ram: Int, memoria: Int){
        this.marca = marca
        this.modelo = modelo
        this.procesador = procesador
        this.ram = ram
        this.memoria = memoria
    }

    fun getMarca(): String{
        return marca
    }
    fun getModelo(): String{
        return modelo
    }
    fun getProcesador(): String{
        return procesador
    }
    fun getRam(): Int{
        return ram
    }
    fun getMemoria(): Int{
        return memoria
    }

    fun setMarca(marca: String){

    }
    fun setModelo(){

    }
    fun setProcesador(){

    }
    fun setRam(){

    }
    fun setMemoria(){

    }
}