package POO_17092022;

/*
/*
 * Realizar un Menu con opcion Switch y un menu anidado para realziar operaciones varias, debera volver al menu principal mientras ejecuta su programa
 * hasta que se elija otra opcion debera iterar sin romper el ciclo.....................
 */
/**
 *
 * @author Luis Alfredo Felipe Sic
 *
 */
import java.util.Scanner;

public class Banco {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         * Nota: Aca en el Main Creamos las Intancias de la clase cuentaBanco y
         * cuentabanco2
         *
         */
        cuentaBanco consulta = new cuentaBanco();
        cuentaAbonos abonos = new cuentaAbonos();
        retiroCuentas retiros = new retiroCuentas();
        /**
         * Aca creamos los objetos Cuenta1 y Cuenta2 de la clase cuentaBanco
         */

        char op;
        do {
            System.out.println("\n********** Bienvendio:  ********** \r\n"
                    + "   Seleccione una opcion: \r\n"
                    + "   c - Consultar la cuenta \r\n"
                    + "   a - Abonar a la cuenta \r\n"
                    + "   r - Retirar de la cuenta \r\n"
                    + "   s - Salir  \r\n");
            op = entrada.next().charAt(0);

            switch (op) {

                /*el objeto cuenta1 nos muestra todos los Metodos  y Atributos que tiene la clase operacion*/
                case 'c':
                    consulta.ConsultaCuentas("");
                    break;
                case 'a':
                    abonos.cuentaAbonos("");
                    break;
                case 'r':
                    retiros.retiroCuentas("");
                    break;
                default:
                    System.out.println("Sin operaciones...");
                    break;

            }
        } while (op != 'S' && op != 's');

    }

}
