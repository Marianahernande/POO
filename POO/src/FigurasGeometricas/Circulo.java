package FigurasGeometricas;

public class Circulo extends Figura{

    float radio;

    public Circulo (Float radio){
        this.radio=(float) radio;
        
}

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void calcularArea(){
        double area=0;

        area=3.14 *(radio*radio);
        System.out.println("El radio del circulo es "+radio+" y su área es "+area);
    
    }
}
