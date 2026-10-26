package PolimofirsPractice;

public class Transporte {
    String nombre;
    int numeroDeRuedas;
    String tipo_De_Energía_O_Combustible;

    public Transporte(String nombre, int numeroDeRuedas, String tipo_De_Energía_O_Combustible) {
        this.nombre = nombre;
        this.numeroDeRuedas = numeroDeRuedas;
        this.tipo_De_Energía_O_Combustible = tipo_De_Energía_O_Combustible;
    }

    public void mostrarInformacion() {
        System.out.println("Transporte: " + nombre);
    }

    public void moverse() {
        System.out.println(nombre + " se está desplazando.");
    }
}
