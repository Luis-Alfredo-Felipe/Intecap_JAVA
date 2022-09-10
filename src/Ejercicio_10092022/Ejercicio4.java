/*
 * Realizar un Juego que adivine un Numero. Para ello pedir un numero N, luego ir pidiendo numeros indicando mayor o menor,
 * respecto a N. El proceso termina cuando el usuario acierta
 */
package Ejercicio_10092022;

import java.util.Scanner;

/**
 * * @author Luis Alfredo Felipe Sic
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, compara;

        System.out.print("Introduzca un numero para adivinar: ");
        compara = entrada.nextInt();
        System.out.println("----------------------------------");

        do {
            System.out.print("Introduzca un numero: ");
            n1 = entrada.nextInt();
            if (compara > n1) {
                System.out.println("No. Menor: " + n1);
            } else if (compara < n1) {
                System.out.println("No. Mayor: " + n1);
            }

        } while (compara != n1);
        System.out.println("fin del Programa ha acertado: " + n1);

    }
}
