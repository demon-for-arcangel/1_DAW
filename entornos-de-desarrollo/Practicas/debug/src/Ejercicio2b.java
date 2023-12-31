import java.util.Scanner;
/*
Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
Al terminar, mostrará lo siguiente:
– mayor numero introducido
– menor número introducido
– suma de todos los números
– suma de los números positivos
– suma de los números negativos
– media de la suma (la primera que pido)
El número -1 no contara como número.
 */
public class Ejercicio2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables necesarias
        String nombre = "Marina_Laguna";
        int numeroUsuario=0;
        int menor=0;
        int mayor=0;
        int suma=0;
        double media;
        int contador=-1;
        int sumaPositivos=0;
        int sumaNegativos=0;

        //Creamos el Scanner
        Scanner sn = new Scanner(System.in);

        do{

            //Comprobamos si el numero es menor
            //que el actual menor
            if(menor<numeroUsuario){
                mayor = numeroUsuario;
            }

            //Comprobamos si el numero es mayor
            //que el actual mayor
            if(mayor>numeroUsuario){
                menor=numeroUsuario;
            }

            //Suma el numero y lo acumulamos
            suma+=numeroUsuario;

            //Si el numero es positivo, suma a la variable de los positivos
            // y sino a la de los negativos
            if(numeroUsuario>=0){
                sumaPositivos+=numeroUsuario;
            }else{
                sumaNegativos+=numeroUsuario;
            }

            //aumento el contador
            contador++;

            //pido un numero al usuario
            System.out.println("Introduce un numero");
            numeroUsuario = sn.nextInt();

            //Cuando el usuario ponga un -1, saldremos
            //Se puede usar un while normal
        }while(numeroUsuario!=-1);

        //Calculamos la media
        media = (double) suma / contador;

        //Mostramos los valores
        System.out.println("El menor es: "+menor);
        System.out.println("El mayor es: "+mayor);
        System.out.println("La suma es: "+suma);
        System.out.println("La suma de los positivos es: "+sumaPositivos);
        System.out.println("La suma de los negativos es: "+sumaNegativos);
        System.out.println("La media es: "+media);

    }

}
