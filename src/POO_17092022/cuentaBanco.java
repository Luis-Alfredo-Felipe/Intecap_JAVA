package POO_17092022;

/*
 * Realizar un Menu con opcion Switch y un menu anidado para realziar operaciones varias, debera volver al menu principal mientras ejecuta su programa
 * hasta que se elija otra opcion debera iterar sin romper el ciclo.....................

* @author Luis Alfredo Felipe Sic
 */
import java.util.Scanner;

/* Creacion de la clase cuentaBanco*/
public class cuentaBanco {

    public static Scanner entrada = new Scanner(System.in);
    public static Float SaldoCC1 = 300f, SaldoCC2 = 0f;
    int opcion;

    public String ConsultaCuentas(String consulta) {

        do {
            System.out.println("Bienvenido! Seleccione una Operacion:\r\n"
                    + " 1 Consultar Cuenta No. 1 \r\n"
                    + " 2 Consultar Cuenta No. 2 \r\n"
                    + " 0 para salir \r\n"
                    + "");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cuenta: Luis Alfredo Felipe Sic");
                    System.out.println("Banco: BI Industrial");
                    System.out.println("Cuenta: 01414000-03");
                    System.out.println("Saldo: Q. " + SaldoCC1);
                    break;
                case 2:
                    System.out.println("Cuenta: Jose Mendizabal Mazariegos ");
                    System.out.println("Banco: Banco G&T");
                    System.out.println("Cuenta: 05678000-03");
                    System.out.println("Saldo: Q. " + SaldoCC1);
                    break;
                case 3:
                    System.out.println("Opcion no Valida...!");
                    break;
            }

        } while (opcion != 0);

        return consulta;
    }



}
