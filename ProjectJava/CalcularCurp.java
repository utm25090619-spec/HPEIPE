package ProjectJava;

import java.util.Scanner;
import java.util.Random;

public class CalcularCurp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer Apellido: ");
        String apellido1 = removerEspacios(scanner.nextLine()).toUpperCase();

        System.out.print("Segundo Apellido (Presiona ENTER si no tienes): ");
        String apellido2 = removerEspacios(scanner.nextLine()).toUpperCase();

        System.out.print("Nombre(s): ");
        String nombre = removerEspacios(scanner.nextLine()).toUpperCase();

        System.out.print("Año de nacimiento (4 dígitos): ");
        String anio = removerEspacios(scanner.nextLine());

        System.out.print("Mes de nacimiento (2 dígitos): ");
        String mes = removerEspacios(scanner.nextLine());

        System.out.print("Día de nacimiento (2 dígitos): ");
        String dia = removerEspacios(scanner.nextLine());

        System.out.print("Sexo (H/M): ");
        String sexo = removerEspacios(scanner.nextLine()).toUpperCase();

        System.out.print("Código del Estado de nacimiento: ");
        String estado = removerEspacios(scanner.nextLine()).toUpperCase();

        String nombreUtil = obtenerNombreUtil(nombre);

        String curp = "";

        curp += apellido1.charAt(0);
        curp += obtenerPrimeraVocalInterna(apellido1);

        if (apellido2.isEmpty()) {
            curp += 'X';
        } else {
            curp += apellido2.charAt(0);
        }

        curp += nombreUtil.charAt(0);
        curp += anio.substring(2);  
        curp += mes;
        curp += dia;
        curp += sexo.charAt(0);
        curp += estado;
        curp += obtenerPrimeraConsonanteInterna(apellido1);

        if (apellido2.isEmpty()) {
            curp += 'X';
        } else {
            curp += obtenerPrimeraConsonanteInterna(apellido2);
        }

        curp += obtenerPrimeraConsonanteInterna(nombreUtil);
        curp += generarHomoclave();

        System.out.println("La CURP generada es: " + curp);

        scanner.close();
    }


    private static String removerEspacios(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "";
        }
        int inicio = 0;
        int fin = texto.length() - 1;

        while (inicio <= fin && texto.charAt(inicio) <= ' ') {
            inicio++;
        }
        while (fin >= inicio && texto.charAt(fin) <= ' ') {
            fin--;
        }
        return texto.substring(inicio, fin + 1);
    }

    private static String obtenerNombreUtil(String nombre) {
        String[] partes = nombre.split(" ");
        if (partes.length > 1) {
            if (partes[0].equals("JOSE") || partes[0].equals("MARIA") || 
                partes[0].equals("J") || partes[0].equals("M")) {
                return partes[1];
            }
        }
        return partes[0];
    }

    private static char obtenerPrimeraVocalInterna(String texto) {
        for (int i = 1; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                return c;
            }
        }
        return 'X'; 
    }

    private static char obtenerPrimeraConsonanteInterna(String texto) {
        for (int i = 1; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c) && 
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                return c;
            }
        }
        return 'X'; 
    }

    private static String generarHomoclave() {
        Random random = new Random();
        char letra = (char) ('A' + random.nextInt(26));
        int numero = random.nextInt(10);
        return "" + letra + numero;
    }
}



