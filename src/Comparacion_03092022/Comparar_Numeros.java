/*
    Realice un programa que pida dos numeros y nos diga si son iguales o no
 */
package Comparacion_03092022;

import java.util.Scanner;

/**
 *
 * @author LFelipe
 */
public class Comparar_Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        int n1 = entrada.nextInt();

        System.out.print("Ingrese segundo numero: ");
        int n2 = entrada.nextInt();

        if (n1 == n2) {
            System.out.print("Los valores son iguales");
        } else {
            System.out.println("los valores son diferentes");
        }
    }

}
