package POO_17092022;

/*
/*
 * Realizar un Menu con opcion Switch y un menu anidado para realziar operaciones varias, debera volver al menu principal mientras ejecuta su programa
 * hasta que se elija otra opcion debera iterar sin romper el ciclo.....................
 */

/**
 *
 * @author Luis Alfredo Felipe Sic
 */
import java.util.Scanner;

/* Creacion de la clase cuentaBanco2*/
public class cuentaBanco2 {

    public static Scanner entrada = new Scanner(System.in);
    public static Float SaldoCC2 = 0f;

    /*--Atributos--*/
    String Nombre = "Jose Rodrigo Mendizabal";
    String Banco = "Banco Azteca ";
    String Cuenta = "01316000-08";

    /*--Metodos--*/
    public void consultarCC2() {
        System.out.println("Nombre Cuenta: " + Nombre + " \r\n"
                + "Banco: " + Banco + "\r\n"
                + "No. Cuenta: " + Cuenta + "\r\n"
                + "Saldo: Q." + SaldoCC2);
    }

    public void abonarCC2() {
        System.out.print("Ingrese el Monto a abonar: ");
        int n1 = entrada.nextInt();
        SaldoCC2 += n1;
        System.out.println("Su monto actual es de: " + "Q" + SaldoCC2 + ".00");
    }

    public void debitarCC2() {
        System.out.print("Ingrese el Monto a debitar: ");
        int n1 = entrada.nextInt();
        if (SaldoCC2 < n1) {
            System.out.println("Error, no tiene fondos suficientes Elija otra opcion!");
        } else {
            SaldoCC2 -= n1;
            System.out.println("Su monto actual es de: " + "Q" + SaldoCC2 + ".00");
        }

    }

}
