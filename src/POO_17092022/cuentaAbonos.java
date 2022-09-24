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

/* Creacion de la clase cuentaAbonos*/
public class cuentaAbonos {

    public static Scanner entrada = new Scanner(System.in);
    public static Float SaldoCC1 = 300f, SaldoCC2 = 0f;
    double opcion, n1, n2, cuenta1, cuenta2;

    public String cuentaAbonos(String abonos) {

        System.out.println("Abonar a cuenta NO. 1");
        do {
            System.out.println("Ingrese el Monto Q.");
            n1 = entrada.nextDouble();
            cuenta1 += n1;
        } while (opcion != 0);
        System.out.println("El nuevo Saldo es: " + (SaldoCC1 + cuenta1));
        System.out.println("\n\n");

        System.out.println("Abonar a cuenta NO. 2");
        do {
            System.out.println("Ingrese el Monto Q.");
            n2 = entrada.nextDouble();
            cuenta2 += n2;
        } while (opcion != 0);
        System.out.println("El nuevo Saldo es: " + (SaldoCC2 + cuenta2));
        System.out.println("\n\n");
        System.out.println("Fin de las transacciones");
        return abonos;
    }
}
