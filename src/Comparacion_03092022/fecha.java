/*
 *
 * Crear un programa que pida dia, mes, año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 dias:
 * 
 */
package Comparacion_03092022;

import java.util.Scanner;

/**
 *
 * @author Luis Felipe
 */
public class fecha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dia, mes, year;

        System.out.println("----------------------");
        System.out.println("Dia -- Mes -- Año ");
        System.out.println("----------------------");

        System.out.print("Ingrese el dia: ");
        dia = entrada.nextInt();

        System.out.print("Ingrese el mes: ");
        mes = entrada.nextInt();

        System.out.print("Ingrese el año: ");
        year = entrada.nextInt();

        if (dia < 30 && mes == 4 || dia <= 30 && mes == 6) {
            System.out.println("Fecha Correcta");
        } else if (dia <= 30 && mes == 9 || dia <= 30 && mes == 11) {
            System.out.println("Fecha correcta");
        } else if (dia <= 31 && mes == 1 || dia <= 31 && mes == 3) {
            System.out.println("Fecha correcta");
        } else if (dia <= 31 && mes == 5 || dia <= 31 && mes == 7) {
            System.out.println("Fecha correcta");
        } else if (dia <= 31 && mes == 8 || dia <= 31 && mes == 10) {
            System.out.println("Fecha correcta");
        } else if (dia <= 31 && mes == 12) {
            System.out.println("Fecha correcta");
        } else if (dia <= 28 && mes == 2) {
            System.out.println("Fecha correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }

    }

}
