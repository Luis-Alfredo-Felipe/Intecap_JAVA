/*
    Pedir dos numeros y mostrarlos de mayor a menor
 */
package Comparacion_03092022;

import java.util.Scanner;

/**
 *
 * @author Luis @lfredo Felipe
 */
public class Ordenar_Numeros {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingrese un Numero: ");
        int n1 = Entrada.nextInt();

        System.out.print("Ingrese un Numero: ");
        int n2 = Entrada.nextInt();

        if (n1 > n2) {
            System.out.println("Numeros Ordenados: " + n1);
            System.out.println("Numeros Ordenados: " + n2);

        } else {
            System.out.println("Numeros Ordenados: " + n2);
            System.out.println("Numeros Ordenados: " + n1);
        }

    }

}
