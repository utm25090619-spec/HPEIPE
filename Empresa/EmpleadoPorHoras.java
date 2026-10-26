package Empresa;

public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, double horasTrabajadas, double tarifaHora) {
        super(nombre, "Empleado por Hora");
        setHorasTrabajadas(horasTrabajadas);
        setTarifaHora(tarifaHora);
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas >= 0) {
            this.horasTrabajadas = horasTrabajadas;
        }
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        if (tarifaHora >= 0) {
            this.tarifaHora = tarifaHora;
        }
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaHora;
    }
}
