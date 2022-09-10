/*
 * Realice un programa que pida un numero y muestre su cuadrado, repetir el proceso hasta que ingrese un numero negativo
 */
package Ejercicio_10092022;

import java.util.Scanner;

/**
 *
 * @author Luis Alfredo Felipe Sic
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1 = 0, total;

        while (n1 >= 0) {
            System.out.print("Ingrese los numeros: ");
            n1 = entrada.nextInt();
            total = n1 * n1;
            System.out.println("El cuadrado del numero es:" + total);

            if (n1 <= 0) {
                System.out.println("El programa ha finalizado" + n1);
                break;
            }
        }
    }
}
