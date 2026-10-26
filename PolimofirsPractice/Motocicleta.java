package PolimofirsPractice;

public class Motocicleta extends Transporte{
   public Motocicleta(String nombre, int numeroDeRuedas, String tipo_De_Energía_O_Combustible) {
        super(nombre, numeroDeRuedas, tipo_De_Energía_O_Combustible); 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Motocicleta: " + nombre);
        System.out.println("Ruedas: " + numeroDeRuedas);
        System.out.println("Energía/Combustible: " + tipo_De_Energía_O_Combustible);
    }
    @Override
    public void moverse() {
        System.out.println("La motocicleta " + nombre + " se desplaza acelerando sobre dos ruedas con su motor de " + cilindrada + " cc.");
    }
}
