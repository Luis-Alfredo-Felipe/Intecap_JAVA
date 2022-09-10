/*
 * Realice un programa que lea numeros hasta que ingrese 0, para cada uno indicar si es par o impar
 */
package Ejercicio_10092022;

import java.util.Scanner;

/**
 *
 * @author Luis Alfredo Felipe Sic
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1;

        do {
            System.out.print("Ingrese los numeros: ");
            n1 = entrada.nextInt();
            if (n1 % 2 == 0) {
                System.out.println("el numero es par");
            } else {
                System.out.println("el numero es impar");
            }
        } while (n1 != 0);
        System.out.println("Fin ha ingresado:" + n1);

    }

}
