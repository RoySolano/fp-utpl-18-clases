/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        System.out.println("Ingrese el número del día:");
        dia = entrada.nextInt();
        switch (dia) {
            case 1:
                System.out.printf("Lunes\n");
                break;
            case 2:
                System.out.printf("Marttes\n");
                break;
            case 3:
                System.out.printf("Miércoles\n");
                break;
            case 4:
                System.out.printf("Jueves\n");
                break;
            case 5:
                System.out.printf("Viernes\n");
                break;
            case 6:
                System.out.printf("Sábado\n");
            default:
                System.out.printf("Domingo\n");
        }
    }
    
}
