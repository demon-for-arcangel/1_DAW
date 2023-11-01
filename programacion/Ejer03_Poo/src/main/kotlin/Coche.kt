class Coche {
    private var marca: String = ""
    private var modelo: String = ""
    private var color: String = ""
    private var matricula: String = ""
    private var encendido: Boolean = true
    private var marchaActual: Int = 0
    private var velocidadActual: Int = 0

    //CONSTRUCTORES
    constructor(marca: String, modelo: String, color: String, matricula: String){
        this.marca = marca
        this.modelo = modelo
        this.color = color
        this.matricula = matricula
        this.encendido = false
        this.marchaActual = 0
        this.velocidadActual = 0
    }

    //METODOS
    fun arrancar(){
        if (!encendido){
            encendido = true
            println("El coche ha arrancado")
        }else{
            println("El coche ya estaba encendido")
        }
    }

    fun pararMotor(){
        encendido = false
    }

    fun acelerar(velocidadDeseada: Int){
        if (encendido){
            while (velocidadActual < velocidadDeseada){
                velocidadActual += 10
                if (velocidadActual >= 0 && velocidadActual <= 30){
                    marchaActual = 1
                }else{
                    if (velocidadActual > 30 && velocidadActual <= 50){
                        marchaActual = 2
                    }else{
                        if (velocidadActual > 50 && velocidadActual <= 70){
                            marchaActual = 3
                        }else{
                            if (velocidadActual > 70 && velocidadActual <= 100){
                                marchaActual = 4
                            }else{
                                if (velocidadActual > 100){
                                    marchaActual = 5
                                }
                            }
                        }
                    }
                }
                println("Velocidad actual: $velocidadActual km/h, marcha: $marchaActual")
                if (Math.random() < 0.1){
                    println("¡Cuidado el gato!")
                    frenar()
                    println("El coche se ha calado!")
                }
            }
        }else{
            println("El coche no está encendido.")
        }
    }

    fun mantenerVelocidad(tiempo: Int){
        if (encendido){
            println("Manteniendo velocidad actual de $velocidadActual km/h durante $tiempo segundos.")
            Thread.sleep(tiempo * 1000.toLong())
        }else{
            println("El coche no está encendido")
        }
    }

    fun frenar(){
        if (encendido){
            while (velocidadActual > 0){
                velocidadActual -= 10
                if (velocidadActual >= 0 && velocidadActual <= 30){
                    marchaActual = 1
                }else{
                    if (velocidadActual > 30 && velocidadActual <= 50){
                        marchaActual = 2
                    }else{
                        if (velocidadActual > 50 && velocidadActual <= 70){
                            marchaActual = 3
                        }else{
                            if (velocidadActual > 70 && velocidadActual <= 70){
                                marchaActual = 4
                            }else{
                                if (velocidadActual > 100){
                                    marchaActual = 5
                                }
                            }
                        }
                    }
                }
                println("El coche ha parado.")
            }
        }
    }
}