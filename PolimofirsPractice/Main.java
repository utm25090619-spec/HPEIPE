package PolimofirsPractice;

public class Main {
    public static void main(String[] args) {
        Transporte auto = new Automovil("Nissan Versa", 4, "Gasolina");
        Transporte moto = new Motocicleta("Yamaha FZ", 2, "Gasolina");
        Transporte bici = new Bicicleta("BMX Freestyle", 2, "Metabólica (Pedaleo)");
        Transporte bus = new Autobus("Volvo 9700", 6, "Diésel");
        Transporte avion = new Avion("Boeing 737", 6, "Turbosina");

        Transporte[] listaTransportes = {auto, moto, bici, bus, avion};


        for (Transporte transporte : listaTransportes) {
            transporte.mostrarInformacion();
        }
    }
}
