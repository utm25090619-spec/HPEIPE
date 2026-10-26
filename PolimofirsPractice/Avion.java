package PolimofirsPractice;

public class Avion extends Transporte{
    public Avion(String nombre, int numeroDeRuedas, String tipo_De_Energía_O_Combustible) {
        super(nombre, numeroDeRuedas, tipo_De_Energía_O_Combustible); 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avion: " + nombre);
        System.out.println("Ruedas: " + numeroDeRuedas);
        System.out.println("Energía/Combustible: " + tipo_De_Energía_O_Combustible);
    }

    @Override
    public void moverse() {
        System.out.println("El avión " + nombre + " vuela a través del cielo a una altitud de hasta " + altitudMaxima + " metros.");
    }
}
