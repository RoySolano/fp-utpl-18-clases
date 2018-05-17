/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        for (int contador = 1; contador <= 20; contador++){
            if (contador % 2 == 0){
               suma = suma+contador;
            }
        }
        System.out.printf("%d ",suma);
    }
    
}
