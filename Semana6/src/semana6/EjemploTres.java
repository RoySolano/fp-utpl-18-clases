/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploTres {
     public static void main(String[] args) {
         String cadenafinal;
         Scanner entrada = new Scanner (System.in);
         int suma = 0;
         int edad;
         int contador = 1;
         cadenafinal = String.format("%s\t%s\n","Edad","Suma");
         while (contador <= 5){
             System.out.println("Ingrese la edad:");
             edad = entrada.nextInt();
             suma = suma + edad;
             cadenafinal = String.format("%s%d\t%d\n",cadenafinal,edad,suma);
             contador = contador + 1;
            }
         System.out.printf("%s",cadenafinal);
    }
}
