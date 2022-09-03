/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_intecap;

import java.util.Scanner;

/**
 *
 * @author Selecom
 */
public class if_anidados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su Usuario:");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su Contraseña:");
        String passwoord = entrada.nextLine();

        if (passwoord.equals("luis123") && usuario.equals("Luis Felipe")) {
            System.out.println("Bienvenido al sistema");
        } else if (usuario.equals("luisfelipe")) {
            System.out.println("Usuario Incorrecto");
        } else if (passwoord.equals("Luis")) {
            System.out.println("Contraseña Incorrecta");
        } else {
            System.out.println("Error de Usuario o Contraseña");
        }
    }

}
