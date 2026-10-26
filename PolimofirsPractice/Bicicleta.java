package PolimofirsPractice;

public class Bicicleta extends Transporte{
    public Bicicleta(String nombre, int numeroDeRuedas, String tipo_De_Energía_O_Combustible) {
        super(nombre, numeroDeRuedas, tipo_De_Energía_O_Combustible); 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bicicleta: " + nombre);
        System.out.println("Ruedas: " + numeroDeRuedas);
        System.out.println("Energía/Combustible: " + tipo_De_Energía_O_Combustible);
    }

    @Override
    public void moverse() {
        System.out.println("La bicicleta " + nombre + " se desplaza mientras el ciclista pedalea fuertemente.");
    }

  
}
