package Polimorfismo;

public class Cuadrado extends Figura {

    double altura;
    double base;

//este procesa un cuadraddo
    Cuadrado(int numeroLados, double altura, String nombre){
        super(numeroLados);
        this.altura = altura;
        this.base = altura;
    }
//este procesa un rectangulo
    Cuadrado(int numeroLados, double altura, double base){
        super(numeroLados);
        this.altura = altura;
        this.base = base;
    }

    @Override 
    public double getArea(){
        return this.altura * this.base;
    }
    
}
