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
public class EjercicioFinal {
    public static void main(String[] args) {
        String cadenafinal;
        Scanner entrada = new Scanner(System.in);
        double altura;
        double promedio = 0;
        double suma = 0;
        int contador = 1;
        boolean opcion = true;
        cadenafinal = String.format("%s\n%s\n","Reporte de estaturas","Estaturas de estudiantes:");
        
        while (opcion){
            System.out.printf("Ingrese la estatura número %d:\n", contador);
            altura = entrada.nextDouble();
            if (altura < 1.20){
                altura = 1.20;
            }
            suma = suma + altura;
            promedio = suma / contador;
            cadenafinal = String.format("%s%.2f\n",cadenafinal,altura);
            contador = contador + 1;
            
            entrada.nextLine();
            System.out.println("Ingrese si para salir");
            String temporal = entrada.nextLine();
            if(temporal.equals("si") || temporal.equals("Si")){
                opcion = false;
            }
        }
        System.out.printf("%s",cadenafinal);
        System.out.printf("%s %.2f\n","Promedio de esturas:",promedio);
        System.out.printf("%s\n","Reporte generado por Dep. Deportes");
    }
}
