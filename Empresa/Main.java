package Empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new EmpleadoFijo("Ana Gómez", 2500.00));
        listaEmpleados.add(new EmpleadoPorHoras("Carlos López", 160, 15.50));
        listaEmpleados.add(new EmpleadoFijo("María Rodríguez", 3100.00));
        listaEmpleados.add(new EmpleadoPorHoras("Pedro Martínez", 120, 18.00));

        System.out.printf("%-20s | %-20s | %-15s%n", "Nombre", "Tipo de Empleado", "Sueldo Mensual");
        for (Empleado emp : listaEmpleados) {
            System.out.printf("%-20s | %-20s | $%,.2f%n",
                    emp.getNombre(),
                    emp.getTipo(),
                    emp.calcularSueldo());
        }
    }
}
