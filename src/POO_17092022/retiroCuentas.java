/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_17092022;

import java.util.Scanner;

/**
 *
 * @author Selecom
 */
public class retiroCuentas {

    public Scanner entrada = new Scanner(System.in);
    public static Float SaldoCC1 = 300f, SaldoCC2 = 0f;
    char opcion;
    double t1 = 0;
    double t2 = 0;

    public String retiroCuentas(String retiro) {

        do {
            System.out.println("Cuenta a Debitar :\r\n"
                    + " a Cuenta No. 1 \r\n"
                    + " b Cuenta No. 2 \r\n"
                    + " s Salir al Menu Principal \r\n"
                    + "");
            opcion = entrada.next().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println("Saldo Actual: Q." + SaldoCC1);
                    System.out.print("Ingrese el Monto a debitar: ");
                    int n1 = entrada.nextInt();
                    if (SaldoCC1 < n1) {
                        System.out.println("Error, no tiene fondos suficientes Elija otra opcion!");
                    } else {
                        SaldoCC1 -= n1;
                        System.out.println("Su monto actual es de: " + "Q" + SaldoCC1 + ".00");
                    }
                    break;

                case 'b':
                    System.out.print("Ingrese el Monto a debitar: ");
                    int n2 = entrada.nextInt();
                    if (SaldoCC2 < n2) {
                        System.out.println("Error, no tiene fondos suficientes Elija otra opcion!");
                    } else {
                        SaldoCC2 -= n2;
                        System.out.println("Su monto actual es de: " + "Q" + SaldoCC2 + ".00");
                    }

                    break;
                case 'c':
                    System.out.println("Opcion Invalida");
                    break;

            }

        } while (opcion != 'S' && opcion != 's');

        return retiro;
    }

}
