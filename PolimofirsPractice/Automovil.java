package PolimofirsPractice;

public class Automovil extends Transporte{
   public Automovil(String nombre, int numeroDeRuedas, String tipo_De_Energía_O_Combustible) {
        super(nombre, numeroDeRuedas, tipo_De_Energía_O_Combustible); 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Automovil: " + nombre);
        System.out.println("Ruedas: " + numeroDeRuedas);
        System.out.println("Energía/Combustible: " + tipo_De_Energía_O_Combustible);
    }
    @Override
    public void moverse() {
        System.out.println("El automóvil " + nombre + " está conduciendo por la carretera sobre sus " + numeroDeRuedas + " ruedas.");
    }
}
