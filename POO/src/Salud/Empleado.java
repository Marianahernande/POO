package Salud;

public class Empleado extends Persona3 {
 
    
    private String cargo, departamento;
private float valorHora, horasT, producto;
private double hono;

//método constructor
public Empleado(String nombre, String apellido, String tipoDoc, int doc,
             String cargo, String departamento, float horasT, float valorHora) {
        super(nombre, apellido, tipoDoc, doc);
        this.cargo=cargo;
        this.departamento=departamento;
        this.horasT=horasT;
        this.valorHora=valorHora;
        
    }
  
    public void mostrarPersona(){
        System.out.println("Los datos de la persona son: \n Nombre: "+getNombre()+" \n Apellido: "+getApellido()+" \n Tipo de Documento: "+getTipoDoc()+" \n Numero de documento: "+getDoc()+"  \n Cargo: "+cargo+" \n Departamento: "+departamento+" \n Horas trabajadas: "+horasT+" \n Valor de horas trabajadas: "+valorHora);
     }


public void calcularHonorarios(){

    producto=(valorHora*horasT);
    hono=(producto-(0.966*producto)/100);

    System.out.println("El total de sus honorarios es: "+hono);
}


}                                           