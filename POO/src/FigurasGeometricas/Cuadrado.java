package FigurasGeometricas;


public class Cuadrado extends Figura{
    //atributos
    float lado;

    //método constrcutor
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    //metodos accesores
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    public void calcularArea(){
        float area;
        area=lado*lado;

        System.out.println("El lado de la figura cuadrado es: "+lado+" y su área es: "+area);
    }
    
}
