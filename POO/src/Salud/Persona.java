package Salud;

import java.util.Scanner;

public class Persona {
    
 //Atributos
 private String nombre, apellido, tipoDoc, sexo;
 private int  edad;
 public double estatura, peso, imc;

 //Metodos

 public void registrarPersona(){
     Scanner leer=new Scanner (System.in);

     System.out.println("Por favor digite su nombre");
     nombre=leer.next();

     System.out.println("Por favor digite su apellido");
     apellido=leer.next();

     System.out.println("Por favor digite su tipo de documento");
     tipoDoc=leer.next();

     System.out.println("Por favor digite cuál es su sexo");
     sexo=leer.next();

     System.out.println("Por favor digite su peso");
     peso=leer.nextDouble();

     System.out.println("Por favor digite su estatura");
     estatura=leer.nextDouble();

     System.out.println("Por favor digite su edad");
     edad=leer.nextInt();

leer.close();
 }
 public void calcularDatos(){
     imc=peso/(estatura*estatura);

     if(imc<20){
         System.out.println("PESO BAJO");
     }
     else if(imc>20 && imc<25){
         System.out.println("peso es ideal");
     }
     else if(imc>25){
         System.out.println("Tiene sobrepeso");
     }
 }


 public void mayorEdad(){
    if(edad>=18){
     System.out.println("Es mayor de edad");
    }
    else{
     System.out.println("No es mayor edad");
    }
 }

 public void mostrarDatos(){
     System.out.println("El nombre es: "+nombre);
     System.out.println("El apellido es: "+apellido);
     System.out.println("El tipo de documento es: "+tipoDoc);
     System.out.println("El tipo sexo es: "+sexo);
     System.out.println("El peso es: "+peso);
     System.out.println("La estatura es: "+estatura);
     System.out.println("La edad es: "+edad);
     System.out.println("Su indice de masa corporal es "+imc);
     
 }
 
}
  