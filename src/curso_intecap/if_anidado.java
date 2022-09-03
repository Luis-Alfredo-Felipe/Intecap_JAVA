package curso_intecap;

import java.util.Scanner;

/**
 *
 * @author Selecom
 */
public class if_anidado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su Usuario:");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su Contraseña:");
        String passwoord = entrada.nextLine();

        if (passwoord.equals("luis123") && usuario.equals("Luis Felipe")) {
            System.out.println("Cuantos años tienes");
            int edad = entrada.nextInt();
            if (edad > 18) {
                System.out.println("Bienveido al Juego");
            } else {
                System.out.println("No puede ingresar un menor de edad");
            }
        } else {
            System.out.println("Error de Usuario o Contraseña");
        }
    }

}
