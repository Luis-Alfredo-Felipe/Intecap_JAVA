/*
 * Crear un programa que pida 15 valores numericos
 * ingrese los valores y despues despliegue una matriz de 3 x 5
 */
package Arreglos_01_10_2022;

import java.util.Scanner;

/**
 *
 * @author Luis @lfredo Felipe Sic
 */
public class LlenadoMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int vector[][] = new int[3][5];

        for (int[] vector1 : vector) {
            for (int j = 0; j < vector[0].length; j++) {
                System.out.print("ingrese valores: ");
                vector1[j] = entrada.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("-----------------------------------");
        for (int[] vector1 : vector) {
            for (int j = 0; j < vector[0].length; j++) {
                System.out.print(vector1[j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("-----------------------------------");

    }

}
