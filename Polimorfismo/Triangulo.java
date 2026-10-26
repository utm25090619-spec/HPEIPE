package Polimorfismo;

public class Triangulo extends Figura{
    double base;
    double altura;


    Triangulo(int numeroLados, double base, double altura){
        super(numeroLados);
        this.base = base;
        this.altura = altura;
    }

    @Override 
    public double getArea(){
        return this.base * this.altura /2;
    }
}
