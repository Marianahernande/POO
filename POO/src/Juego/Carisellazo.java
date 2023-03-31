package Juego;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego {
    private String jugador;
    private int opcion, resultado;

    Scanner leer=new Scanner(System.in);
    public void iniciarJuego() {
        System.out.println("Ingrese su nombre");
        jugador=leer.next();

    }

    public void jugar() {
        System.out.println("Jugador "+jugador+", Elija una opción:\n 1.Cara\n 2.Sello");
        opcion=leer.nextInt();

        
       Random aleatorio=new Random();

       resultado=aleatorio.nextInt(2)+1;
    }

    public void finalizar() {
        if (opcion==1) {
            if (resultado == 1) {
                System.out.println("Jugador "+jugador+" ha salido cara, ?Usted ha ganado!");
            } else {
                System.out.println("Jugador "+jugador+" ha salido sello, usted ha perdido:(.");
            }
        } else if (opcion==2) {
            if (resultado== 2) {

                System.out.println("Jugador "+jugador+" ha salido sello, ¡Usted ha ganado!");
            } else {
                System.out.println("Jugador "+jugador+" ha salido cara, ha perdido.");
            }
        }
    }

    
}
