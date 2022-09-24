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

/* Creacion de la clase cuentaBanco*/
public class cuentaBanco {

    public static Scanner entrada = new Scanner(System.in);
    public static Float SaldoCC1 = 300f;

    /*--Atributos--*/
    String Nombre = "Luis Alfredo Felipe Sic";
    String Banco = "Industrial BI ";
    String Cuenta = "01414000-03";

    /*--Metodos--*/
    public void consultarCC1() {
        System.out.println("Nombre Cuenta: " + Nombre + " \r\n"
                + "Banco: " + Banco + "\r\n"
                + "No. Cuenta: " + Cuenta + "\r\n"
                + "Saldo: Q." + SaldoCC1);
    }

    public void abonarCC1() {
        System.out.print("Ingrese el Monto a abonar: ");
        int n1 = entrada.nextInt();
        SaldoCC1 += n1;
        System.out.println("Su monto actual es de: " + "Q" + SaldoCC1 + ".00");
    }

    public void debitarCC1() {
        System.out.print("Ingrese el Monto a debitar: ");
        int n1 = entrada.nextInt();
        if (SaldoCC1 < n1) {
            System.out.println("Error, no tiene fondos suficientes Elija otra opcion!");
        } else {
            SaldoCC1 -= n1;
            System.out.println("Su monto actual es de: " + "Q" + SaldoCC1 + ".00");
        }
    }

}
