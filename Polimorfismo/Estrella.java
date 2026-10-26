package Polimorfismo;

public class Estrella  extends Figura{
    double baseTriangulo;
    double alturaTriangulo;
    double cantidadPicos;


    Estrella(int numeroLados, double baseTriangulo, double alturaTriangulo, double cantidadPicos){
        super(numeroLados);
        if (cantidadPicos < 5) {
            throw new IllegalArgumentException("no pueden estrellas con menos de 5 picos");
        }
        this.cantidadPicos = cantidadPicos;
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
    }

    @Override 
    public double getArea(){

        //supongamos que tiene un valor de 5
        double areaTriangulo = this.baseTriangulo * this.alturaTriangulo /2;
        //calcular el area del pentagono
        double apotema = this.baseTriangulo/1.453;
        double perimetroCentro = this.baseTriangulo * this.cantidadPicos;
        double areaCentro = perimetroCentro * apotema /2;

        return areaCentro + areaTriangulo * this.cantidadPicos;
    }
    
}
