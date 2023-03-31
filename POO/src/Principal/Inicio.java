package Principal;

import Salud.Persona;

public class Inicio {
    
    public static void main(String[] args) {
        Persona persona=new Persona();

        //invocando un método
        persona.registrarPersona();
        persona.mostrarDatos();
        persona.mayorEdad();
        persona.calcularDatos();


    }
}
