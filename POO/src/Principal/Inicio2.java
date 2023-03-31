package Principal;

import java.util.Scanner;

import Salud.Persona2;

public class Inicio2 {
    public static void main(String[] args) {

        float estatura, peso;

        Scanner captura=new Scanner (System.in);
        //Para invocar métodos de una clase, primero se debe instanciar una clase

        //1. Crear un objeto de la clase
        //2. Invocar el método= Nombre del objeto+ Nombre del método
        
        Persona2 leer=new Persona2();
       
       
        System.out.print("Por favor ingrese el peso de la persona");
        peso=captura.nextFloat();

        System.out.print("Por favor ingrese la estatura de la persona");
        estatura=captura.nextFloat();

        leer.registrarPersona();
        leer.mostrarDatos();
        leer.calcularEdad();

        //cuando invoco un método con parámetros se solicita el argumento.
    
        leer.calcularPeso(estatura, peso);
        
        captura.close();
    }
}
