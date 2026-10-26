package Empresa;

public class EmpleadoFijo extends Empleado {
    private double sueldoMensual;

    public EmpleadoFijo(String nombre, double sueldoMensual) {
        super(nombre, "Empleado Fijo");
        setSueldoMensual(sueldoMensual);
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        if (sueldoMensual >= 0) {
            this.sueldoMensual = sueldoMensual;
        }
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
}
