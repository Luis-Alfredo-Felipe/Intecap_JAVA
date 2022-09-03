package Contar_Palabras;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ContarPalabras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        System.out.print("Ingrese su frase: ");
        texto = entrada.nextLine();
        StringTokenizer conteo = new StringTokenizer(texto);
        System.out.println("Total de Palabras: " + conteo.countTokens());

    }

}
