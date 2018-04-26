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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double grados_c;
        double grados_f;
        double conversion = 0;
        System.out.println("A continuación se presentan las opciones:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("Por favor ingrese el número de su opción:");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Ingrese el número de grados Celsius:");
                grados_c = entrada.nextDouble();
                conversion = ((9*grados_c) / 5)+32;
                break;
            case 2:
                System.out.println("Ingrese el número de grados Fahrenheit:");
                grados_f = entrada.nextDouble();
                conversion = (5*(grados_f-32)) / 9;
        }
        System.out.printf("Conversión: %.2f\n", conversion);
    }
}
