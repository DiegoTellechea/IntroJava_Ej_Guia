/*
 *Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
 *alguno de ellos es mayor a 25.
 */
package ej_6_guia_if_else;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_6_Guia_If_Else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         int num3 = 25;
          System.out.println("Ingrese numero 1 ");      
               
        int num1 = leer.nextInt();
        System.out.println("Ingrese numero 2 "); 
        int num2 = leer.nextInt();
        
        
        if (num1 > num3 && num2 > num3) {
            System.out.println("Ambos números son mayores a 25.");
        } else if (num1 > num3 || num2 > num3) {
            System.out.println("Al menos uno de los números es mayor a 25.");
        } else {
            System.out.println("Ninguno de los números es mayor a 25.");
        }
    }
    
}
