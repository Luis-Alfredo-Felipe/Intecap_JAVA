/*
 * Un programa que lea un numero y muestre su cuadrado, repetir el proceso hasta que se introduzca un valor menor a 0
 ***********/
package Ejercicio_10092022;

import java.util.Scanner;

/**
 * @author Luis Alfredo Felipe
 *
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = 0, total = 0;

        while (n1 >= 0) {
            System.out.print("Ingrese los numeros: ");
            n1 = entrada.nextInt();
            total += n1;

            if (n1 <= 0) {
                System.out.println("El programa ha finalizado");
                System.out.println("Total de Valores ingresador: " + total );
                break;
            }
        }
    }
}
