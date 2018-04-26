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
public class Ejercicio4 {
    
    public static void main(String[] args) {   
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        double precio;
        double descuento;
        double porcentaje = 0;
        double subtotal;
        double total;
        System.out.println("Ingrese la cantidad de balones comprados:");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio dde cada balón:");
        precio = entrada.nextDouble();
        if (cantidad == 1) {
            porcentaje = 0.5;
        }
        if (cantidad == 2) {
            porcentaje = 0.7;
        }
        if (cantidad >= 3) {
            porcentaje = 0.8;
        }
        subtotal = cantidad*precio;
        descuento = subtotal*porcentaje;
        total = subtotal-descuento;
        System.out.printf("Subtotal: %.2f\n",subtotal);
        System.out.printf("Descuento: %.2f\n",descuento);
        System.out.printf("Total: %.2f\n",total);
    }   
}
