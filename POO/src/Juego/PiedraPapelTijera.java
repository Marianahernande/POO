package Juego;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego{

  //Atributos
   private String jugador;
  private int opcion, resultado;

  Scanner leer= new Scanner(System.in);

    public void iniciarJuego() {
       System.out.println("Ingrese el nombre del jugador");
       jugador=leer.next();
    }


    public void jugar() {
       System.out.println("Jugador "+jugador+" elija una opcion \n1 Piedra \n2 Papel \n3 Tijera");
       opcion=leer.nextInt();

       Random aleatorio=new Random();

       resultado=aleatorio.nextInt(3)+1;

       System.out.println("¡Ya estamos escogiendo, prepárate!");
    }

   
    public void finalizar() {
        if(resultado==opcion){
            System.out.println("Usted queda en empate con la maquina");

        }
        else if (resultado==1){
            if(opcion==3) { 
              System.out.println(" \nJugador " +jugador+" sacó Piedra \nMaquina sacó Tijera \n ¡USTED HA GANADO!");
            }   
            else{
                System.out.println("Jugador "+jugador+" ha sacado piedra, usted ha perdido");
            }   

        } 
        else if (resultado==3){
            if(opcion==2){
           
            System.out.println("\nJugador" +jugador+" sacó Tijera \nMaquina sacó Papel");
            System.out.println("¡USTED HA GANADO!");
      }
      else{
        System.out.println("Jugador" +jugador+" usted ha sacado tijera, ha perdido");
      }
      
       }
        else if (resultado==2){
            if(opcion==1){
      
            System.out.println(" \nJugador" +jugador+" sacó Papel \nMaquina sacó Piedra");
            System.out.println("¡USTED HA GANADO! ");
      }
      else{
        System.out.println("Jugador "+jugador+" usted ha sacado papel, ha perdido");
      }
    }
    leer.close();
      
    }

      }
    


