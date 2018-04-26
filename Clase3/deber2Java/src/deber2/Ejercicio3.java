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
public class Ejercicio3 {
    public static void main(String[] args) {
        double y = 0;
        Scanner entrada = new Scanner(System.in);
        double x;
        System.out.println("Ingrese el valor de x:");
        x = entrada.nextDouble();
        if (x < 0) {
            y = 3*x+10;
        }
        if (x > 0) {
            y = 2*x+6;
        }
        if (x == 0) {
            y = 1;
        }
        System.out.printf("El valor de y es: %.2f\n",y);
    }
}
