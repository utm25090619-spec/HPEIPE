package Polimorfismo;

public class Figura {
    int numeroLados;
    String nombre = "figura X";

    Figura(int numeroLados){
        this.numeroLados = numeroLados;
    }
    Figura(int numeroLados, String nombre){
        this.numeroLados = numeroLados;
        this.nombre = nombre;
    }
    public double getArea(){
        return 0.0;
    }

    public double getPerimetro(){
        return 0.0;
    }

    public  double getPerimetro(double... lados){
        double perimetro = 0;
        for(double lado : lados){
            perimetro += lado;
        }
        return perimetro;
    }

    public 

    public void getInfo(){};

    public void getInfo(Figura f){
        String dataFigura = String.format("El nombre de la figura seleccionada es: %\nY su cantidad de lados es: %d", f.nombre, f.numeroLados);
        System.out.print(dataFigura);
    }
}
