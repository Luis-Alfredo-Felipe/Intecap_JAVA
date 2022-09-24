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
        cuentaBanco Cuenta1 = new cuentaBanco();
        cuentaBanco2 Cuenta2 = new cuentaBanco2();
        /**
         * Aca creamos los objetos Cuenta1 y Cuenta2 de la clase cuentaBanco
         */

        char op;
        do {
            System.out.println("Bienvenido! Seleccione una Operacion:\r\n"
                    + " 1 Consultar Cuenta No. 1 \r\n"
                    + " 2 Consultar Cuenta No. 2 \r\n"
                    + " 0 para salir del programa \r\n"
                    + "");
            op = entrada.next().charAt(0);

            switch (op) {
                case '1':
                    do {

                        System.out.println("\n********** CUENTA NO. 1: ********** \r\n"
                                + "   Seleccione una opcion: \r\n"
                                + "   c - Consultar la cuenta \r\n"
                                + "   a - Abonar a la cuenta \r\n"
                                + "   d - Debitar de la cuenta \r\n"
                                + "   s - Salir  \r\n");
                        op = entrada.next().charAt(0);

                        switch (op) {
                            /*el objeto cuenta1 nos muestra todos los Metodos  y Atributos que tiene la clase operacion*/
                            case 'c':
                                Cuenta1.consultarCC1();
                                break;
                            case 'a':
                                Cuenta1.abonarCC1();
                                break;
                            case 'd':
                                Cuenta1.debitarCC1();
                                break;

                            default:
                                break;

                        }
                    } while (op != 'S' && op != 's');
                    break;

                case '2':
                    do {

                        System.out.println("\n********** CUENTA NO. 2: ********** \r\n"
                                + "   Seleccione una opcion: \r\n"
                                + "   c - Consultar la cuenta \r\n"
                                + "   a - Abonar a la cuenta \r\n"
                                + "   d - Debitar de la cuenta \r\n"
                                + "   s - Salir  \r\n");
                        op = entrada.next().charAt(0);

                        switch (op) {
                            /*el objeto cuenta2 nos muestra todos los Metodos  y Atributos que tiene la clase operacion*/
                            case 'c':
                                Cuenta2.consultarCC2();
                                break;
                            case 'a':
                                Cuenta2.abonarCC2();
                                break;
                            case 'd':
                                Cuenta2.debitarCC2();
                                break;

                            default:
                                break;
                        }
                    } while (op != 'S' && op != 's');
                    break;

            }

        } while (op != '0');

    }

}
