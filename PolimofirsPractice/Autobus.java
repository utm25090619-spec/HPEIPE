package PolimofirsPractice;

public class Autobus extends Transporte{
    public Autobus(String nombre, int numeroDeRuedas, String tipo_De_Energía_O_Combustible) {
        super(nombre, numeroDeRuedas, tipo_De_Energía_O_Combustible); 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Autobus: " + nombre);
        System.out.println("Ruedas: " + numeroDeRuedas);
        System.out.println("Energía/Combustible: " + tipo_De_Energía_O_Combustible);
    }

    @Override
    public void moverse() {
        System.out.println("El autobús " + nombre + " conduce haciendo paradas de ruta para llevar a sus " + capacidadPasajeros + " pasajeros.");
    }
}
