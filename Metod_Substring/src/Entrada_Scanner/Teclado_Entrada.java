/* Funcion Scanner ingreso por teclado */
package Entrada_Scanner;

import java.util.Scanner;

/**
 *
 * @author LFelipe
 */
public class Teclado_Entrada {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Cual es su nombre: ");
        String nombre = Entrada.nextLine();
        System.out.print("Ingrese su Edad: ");
        int edad = Entrada.nextInt();
        System.out.println("Buenas noches: " + nombre + ", Ud tiene: " + edad + " Años");

    }
}
