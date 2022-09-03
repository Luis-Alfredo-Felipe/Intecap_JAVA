/*
    Pedir tres numeros y mostrarlos ordenados de mayoa a menor
 */
package Comparacion_03092022;

import java.util.Scanner;

/**
 *
 * @author Luis Alfredo Felipe Sic
 *
 */
public class Ordenar_Numeros2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese 1er. Numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Ingrese 2do. Numero: ");
        int n2 = entrada.nextInt();
        System.out.print("Ingrese 3er. Numero: ");
        int n3 = entrada.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.println("Numeros Ordenados: " + n1 + " " + n2 + " " + n3);
        } else if (n1 > n3 && n3 > n2) {
            System.out.println("Numeros Ordenados: " + n1 + " " + n3 + " " + n2);
        } else if (n2 > n1 && n1 > n3) {
            System.out.println("Numeros Ordenados: " + n2 + " " + n1 + " " + n3);
        } else if (n2 > n3 && n3 > n1) {
            System.out.println("Numeros Ordenados: " + n2 + " " + n3 + " " + n1);
        } else if (n3 > n1 && n1 > n2) {
            System.out.println("Numeros Ordenados: " + n3 + " " + n1 + " " + n2);
        } else {
            System.out.println("Numeros Ordenados: " + n3 + " " + n2 + " " + n1);
        }

    }
}
