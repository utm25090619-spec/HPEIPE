package Empresa;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private String tipo;

    public Empleado(String nombre, String tipo) {
        setNombre(nombre);
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.length() > 0 && !nombre.equals("")) {
            this.nombre = nombre;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public double calcularSueldo() {
        return 0.0;
    }
}
