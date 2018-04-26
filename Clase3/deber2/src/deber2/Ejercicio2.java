/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
     public static void main(String[] args) {
            String nombre = "Luis Álvarez";
            int tipo_cliente = 1;
            double precio = 300;
            int cantidad = 20;
            double descuento;
            double porcentaje = 0;
            double subtotal;
            double total;
         
            switch(tipo_cliente){
                case 1:
                    porcentaje = 0.1;
                    break;
                case 2:
                    porcentaje = 0.2;
                    break;
                case 3:
                    porcentaje = 0.3;
            }
            subtotal = cantidad*precio;
            descuento = subtotal*porcentaje;
            total = subtotal-descuento;
            System.out.printf("Nombre: %s\n",nombre);
            System.out.printf("Tipo de cliente: %d\n",tipo_cliente);
            System.out.printf("Cantidad de celulares: %d\n",cantidad);
            System.out.printf("Precio por cada celular: %.2f\n",precio);
            System.out.printf("Subtotal a pagar: %.2f\n",subtotal);
            System.out.printf("Descuento: %.2f\n", descuento);
            System.out.printf("Valor final a pagar: %.2f\n",total);
                  
                
                    
             
         
        }
}
