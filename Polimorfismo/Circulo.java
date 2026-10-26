package Polimorfismo;

public class Circulo extends Figura {
    double radio;
    double diametro;


    Circulo(int numeroLados, double radio){
        super(numeroLados);
        this.radio = radio;
        this.diametro = diametro;

    }

    @Override 
    public double getArea(){
        return Math.PI * this.radio * this.radio;
    }

    @Override 
    public double getPerimetro(){
        return  2 * Math.PI * diametro;
    }
}
