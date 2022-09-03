/*
    Realice un programa que pida dos numeros y nos indique si es positivo o negativo
 */
package Comparacion_03092022;

import java.util.Scanner;

/**
 *
 * @author Luis felipe
 * *
 */
public class Numero_Negativo_Positivo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un Numero: ");
        int n1 = entrada.nextInt();

        if (n1 < 0) {
            System.out.println("El Numero es Negativo");
        } else {
            System.out.println("El Numero es Positivo");
        }

    }
}
