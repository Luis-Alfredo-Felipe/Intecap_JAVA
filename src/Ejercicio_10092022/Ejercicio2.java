/*
 * Elabore un Programa que lea un numero indicar si es positivo o negativo, repetir el proceso hasta que introduzca 0
 */
package Ejercicio_10092022;

import java.util.Scanner;

/*
 * @author Luis @lfredo Felipe Sic 
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = 0;

        do {
            System.out.print("Introduzca un numero: ");
            n1 = entrada.nextInt();
            if (n1 > 0) {
                System.out.println("No. Positivo: " + n1);
            } else {
                System.out.println("No. Negativo: " + n1);
            }

        } while (n1 != 0);
        System.out.println("fin del Programa ha ingresado: " + n1);

    }

}
