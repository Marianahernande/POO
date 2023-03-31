package FigurasGeometricas;

public class Rectangulo extends Figura {
    float base, altura;

    //método constructor
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

      //getter and setters
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularArea(){
        float area;
        
        area=base*altura;

        System.out.println("La base de la figura rectangulo es: "+base+"  Su altura es "+altura+" Su area es: "+area);
    }
    
    
}
