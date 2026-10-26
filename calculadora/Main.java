import java.util.Scanner;;
public class Main {

    public static void main(String[] args) {
       Scanner lector = new Scanner( System.in);

       Calculadora calculadoraEscolar = new Calculadora("Rectangular",
        "Negro", "Casio", "Basica"
       );
       Calculadora calculadoraCientifica = new Calculadora("Blanca", 
        "Circular", "Mapita", "Cientifica"
       );
 
       //usando metodos de la calculadora basica 

       System.out.println("bienvenido a la colculadora");
       System.out.println("Ingresa los dos valores a manipular");
       System.out.println("valor 1");
       float num1 = lector.nextFloat();
       System.out.println("valor 2");
       float num2 = lector.nextFloat();
       System.out.println("Ingresa el numero de la operacion que deseas realizar");
       System.out.println("1. Suma");
       System.out.println("2. Resta");
       System.out.println("3. Multiplicacion");
       System.out.println("4. Division");
       int opcion = lector.nextInt();
       switch (opcion) {
        case 1: 
            
            break;
       
        default:
            break;
       }

       System.out.println(calculadoraEscolar.sumar(12, 24));
       System.out.println(calculadoraEscolar.resta(15, 7));
       System.out.println(calculadoraEscolar.multi(7, 8));
       System.out.println(calculadoraEscolar.division(15, 5));

    }
}