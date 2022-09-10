/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos_10092022;

import java.util.Scanner;

/**
 *
 * @author Luis @lfredo Felipe 
 */
public class Tabla_Multiplicar {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Ingrese rango inicial: ");
        int n1 = entrada.nextInt();
       
        System.out.print("Ingrese rango final: ");
        int n2 = entrada.nextInt();
       
        for(int i = n1; i <= n2; i++) {
            System.out.println("----TABLA DEL " + i + "-----");
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
    
    

