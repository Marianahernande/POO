package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        
        float lado, base, altura, radio;

        Scanner leer=new Scanner (System.in);

        System.out.println("Por favor digite el lado del cuadrado");
        lado=leer.nextFloat();

        System.out.println("Por favor digite la base del rectangulo");
        base=leer.nextFloat();

        System.out.println("Por favor digite la altura del rectangulo");
        altura=leer.nextFloat();

        System.out.println("Por favor digite el radio del circulo");
        radio=leer.nextFloat();

        //invocar métodos

    Cuadrado c1=new Cuadrado(lado);
    Rectangulo r1= new Rectangulo(base, altura);
    Triangulo t1=new Triangulo(base, altura);
     Circulo i1=new Circulo(radio);

   
    c1.calcularArea();
    r1.calcularArea();
    t1.calcularArea();
    i1.calcularArea();

     leer.close();
    }
}
