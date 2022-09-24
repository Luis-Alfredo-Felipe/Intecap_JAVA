/**********************************************************************************************
 * Programa que solicite un rango de tablas de multiplicar, considere utilizar ciclos  for  * 
 */
package Ciclos_10092022;

import java.util.Scanner;

/**
*  @author Luis @lfredo Felipe 
* ***************************************/
public class Tabla_Multiplicar {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Ingrese 1ra Tabla: ");
        int n1 = entrada.nextInt();
       
        System.out.print("Ingrese Ultima Tabla: ");
        int n2 = entrada.nextInt();
       
        for(int i = n1; i <= n2; i++) {
            System.out.println("----Tabla del " + i + "-----");
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
    
    

