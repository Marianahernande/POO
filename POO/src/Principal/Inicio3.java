package Principal;


import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona3;

public class Inicio3 {
  
    public static void main(String[] args) {
        
        String cargo, departamento;
        float valorHora, horasT;
        Scanner leer=new Scanner (System.in);

        Persona3 persona=new Persona3();

        System.out.println("Ingrese el cargo");
        cargo=leer.next();

        System.out.println("Ingrese el departamento");
        departamento=leer.next();

        System.out.println("Ingrese las horas trabajadas");
        horasT=leer.nextFloat();

        System.out.println("Ingrese el valor de las horas trabajadas");
        valorHora=leer.nextFloat();
        persona.registrarPersona();
        Empleado empleado=new Empleado(persona.getNombre(), persona.getApellido(), persona.getTipoDoc(), persona.getDoc(), cargo, departamento, horasT, valorHora);
        empleado.mostrarPersona();
        empleado.calcularHonorarios();
        leer.close();
    }

}
