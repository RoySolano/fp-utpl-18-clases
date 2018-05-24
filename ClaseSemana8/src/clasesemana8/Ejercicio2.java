/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareafor;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenafinal;//cadena que almcena todos los reportes
        String nivel = "";//variable que almacena: Excelente, muy bueno, bueno o regular
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int n_partidos = 0;
        int n_jugadores = 1;
        int n_pases = 0;
        int n_goles = 0;
        int t_pases = 0;
        int t_goles = 0;
        double sumapases = 0;
        double sumagoles = 0;
        int contadorsup = 1;
        double p_pases = 0;
        double p_goles = 0;
        
        cadenafinal = String.format("%s\n\n%-22s%-18s%-18s%s\n\n","Reporte de Jugadores del Equipo \"UTPL\"","Nombre del Jugador","Total de Pases","Total goles","Nivel de Jugador");
        
        System.out.println("Ingrese el número de jugadores de quienes va a analizar los datos:");
        n_jugadores = entrada.nextInt();
        System.out.println("Ingrese el número de partidos que va a analizar de todos los jugadores:");
        n_partidos = entrada.nextInt();    
        do{
            entrada.nextLine();
            System.out.printf("%s%d%s\n","Ingrese nombre del jugador ",contadorsup,":");
            nombre = entrada.nextLine();
            cadenafinal = String.format("%s%-22s",cadenafinal,nombre);
            for (int contador = 1; contador <= n_partidos; contador++){
                System.out.printf("%s%d%s\n","Ingrese el número de pases en el partido ",contador,":");
                n_pases = entrada.nextInt();
                t_pases = t_pases+n_pases;
                System.out.printf("%s%d%s\n","Ingrese el número de goles en el partido ",contador,":");
                n_goles = entrada.nextInt();
                t_goles = t_goles+n_goles;
                
                cadenafinal = String.format("%s%s%d%s%-14d%s%d%s%-14d\n\n%-22s",cadenafinal,"P",contador,": ",n_pases,"P",contador,": ",n_goles,"");
            }
            sumapases = sumapases + t_pases;
            sumagoles = sumagoles + t_goles;
            
            if ( t_pases >= 100){
                nivel = "Excelente";
            }
            if ( t_pases < 100 && t_pases >=80){
                nivel = "Muy Bueno";
            }
            if ( t_pases < 80 && t_pases >= 60){
                nivel = "Bueno";
            }
            if ( t_pases < 60 && t_pases >= 0){
                nivel = "Regular";
            }
            
            cadenafinal = String.format("%s%s%s%-11d%s%-11d%s\n\n",cadenafinal,"","Total: ",t_pases,"Total: ",t_goles,nivel);
            
            t_pases = 0;
            t_goles = 0;
            contadorsup = contadorsup+1;
        }while(contadorsup <= n_jugadores);
        p_pases = sumapases/n_jugadores;
        p_goles = sumagoles/n_jugadores;
        System.out.println(cadenafinal);
        System.out.println("Datos finales:");
        System.out.printf("%d%s\n",n_jugadores," Jugadores analizados.");
        System.out.printf("%s%.2f\n","Promedio de pases del equipo es: ",p_pases);
        System.out.printf("%s%.2f\n","Promedio de goles del equipo es: ",p_goles);
        System.out.println("Departamento estadístico.");
    }    
}
    

