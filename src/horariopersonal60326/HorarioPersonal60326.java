/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horariopersonal60326;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class HorarioPersonal60326 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Hora;
        String texto = null;
        Scanner Horario = new Scanner(System.in);
        System.out.println("Introduzca una hora entre 1 a 24 hrs");
        Hora = Horario.nextInt();
        
        if (Hora > 0 && Hora <= 24){
            switch (Hora){ 
            case 1:
                texto="Platicar en Whatsapp";
                break;
            case 2:
                texto="Dormir";
                break;
            case 3:
                texto="Dormir";
                break;
            case 4:
                texto="Dormir";
                break;
            case 5:
                texto="Dormir";
                break;
            case 6:
                texto="Dormir";
                break;      
            case 7:
                texto="Clase de administración general";
                break;
            case 8:
                texto="Clase de Física";
                break;
            case 9:
                texto="Clase de Física";
                break;      
            case 10:
                texto="Clase de Ingles";
                break;
            case 11:
                texto="Clase de Ingles";
                break;      
            case 12:
                texto="Clase de Organización Computacional";
                break;
            case 13:
                texto="Clase de Organización Computacional";
                break;      
            case 14:
                texto="Jugar videojuegos";
                break;
            case 15:
                texto="Jugar videojuegos";
                break;      
            case 16:
                texto="Almorzar";
                break;
            case 17:
                texto="Hacer tarea";
                break;
            case 18:
                texto="Hacer tarea";
                break;      
            case 19:
                texto="Clase de Lenguaje de la Programación";
                break;
            case 20:
                texto="Clase de Lenguaje de la Programación";
                break;     
            case 21:
                texto="Bañarme";
                break;
            case 22:
                texto="Cenar";
                break;      
            case 23:
                texto="Hacer tarea";
                break;
            case 24:
                texto="Ver videos en youtube";
                break;
            default:
                
                break;
        }
            System.out.print("En esta hora esta agendado: " + texto);
            
        } else {
            System.out.print("Verifique que el numero estre entre 0 y 24");
        }
    }
    
}
