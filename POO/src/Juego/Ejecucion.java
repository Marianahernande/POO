package Juego;

public class Ejecucion {
    public static void main(String[] args) {
        

        System.out.println("Bienvenido a nuestros juegos, primero, jugarás Carisellazo, después, piedra, papel o tijera, ¡Diviertete!");
        PiedraPapelTijera juego1=new PiedraPapelTijera();
        Carisellazo juego2=new Carisellazo();

        juego2.iniciarJuego();
        juego2.jugar();
        juego2.finalizar();

        juego1.iniciarJuego();
        juego1.jugar();
        juego1.finalizar();
    }
}
