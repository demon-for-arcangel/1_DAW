/**
 * @author marina
 */

import java.util.Scanner;

/**
 * Programa principal
 * En este programa realizaremos sumas, restas, multiplicaciones y divisiones
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        String operacion;

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        System.out.print("Introduce la operación deseada de realizar: ");
        operacion = sc.next();

        /**
         * Tenemos varias opciones que son los case (suma, resta, multiplicacion y division)
         * según la opción que elija el usuario se irá por una opción u otra
         * cada opción realiza una operación diferente.
         */
        switch (operacion){
            case "suma":
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case "resta":
                resultado = num1 - num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case "multiplicación":
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;
            case "división":
                if (num2 == 0){
                    System.out.println("No se puede dividir entre cero");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Operación no válida.");
                }
                break;
            default:
                System.out.println("Operación no válida");
        }
        sc.close();
    }
}