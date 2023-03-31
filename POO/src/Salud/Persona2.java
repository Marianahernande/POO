package Salud;


import java.util.Scanner;

public class Persona2 {
    
    //Atributos
 private String nombre, apellido, tipoDoc, sexo;
 private int doc, edad;


    //Metodos
    //Un metodo siempre debe tener un modificador de acceso+valor de retorno+ parámetros

    public void registrarPersona(){
    Scanner leer=new Scanner(System.in);

    System.out.println("Por favor ingrese el nombre de la persona");
    nombre=leer.next();

    System.out.println("Por favor ingrese el apellido de la persona");
    apellido=leer.next();

    System.out.println("Por favor ingrese su tipo de documento");
    tipoDoc=leer.next();

    System.out.println("Por favor ingrese el numero de documento de la persona");
    doc=leer.nextInt();

    System.out.println("Por favor ingrese el tipo de sexo de la persona");
    sexo=leer.next();

    System.out.println("Por favor ingrese la edad de la persona");
    edad=leer.nextInt();

    leer.close();
     }

     public void mostrarDatos(){
        System.out.println("Los datos de la persona son: \n Nombre: "+nombre+" \n Apellido: "+apellido+" \n Tipo de Documento: "+tipoDoc+" \n Numero de documento: "+doc+" \n Sexo: "+sexo+" \n Edad: "+edad);
     }

     public void calcularEdad (){
    if (edad>=18){
        System.out.println("Es mayor de edad");
    }
    else{
        System.out.println("Es menor de edad");
    }
     }

/* Método con parámetro 
 modificador de acceso+ valor de retorno+ parámetros
 
 3 tipos de parámetros:
 in (entrada) out (salida) inout (Entrada y salida)
 */

 public float calcularPeso ( float estatura, float peso){
    float imc;
 imc=peso/(estatura*estatura);

 System.out.println("El peso de la persona es "+peso+" \n Su altura es "+estatura+" \n Su IMC ES "+imc);

    if(peso<20){
        System.out.println("El peso está por debajo de lo ideal");
    }
    else if(peso>20 && peso<25){
        System.out.println("El peso es ideal");
    }
    else if(peso>25){
        System.out.println("Tiene sobrepeso");
    }

    return imc;

 }




}

