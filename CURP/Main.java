package CURP;

import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner sn = new Scanner(System.in);
    String[] estados = {"Aguascalientes",
"Baja California",
"Baja California Sur",
"Campeche",
"Coahuila de Zaragoza",
"Colima", 
"Chiapas",
"Chihuahua",
"Ciudad de México" , "Distrito Federal",
"Durango",
"Guanajuato",
"Guerrero",
"Hidalgo",
"Jalisco",
"México (Estado de)",
"Michoacán de Ocampo",
"Morelos",
"Nayarit",
"Nuevo León",
"Oaxaca",
"Puebla",
"Querétaro",
"Quintana Roo", "San Luis Potosí",
"Sinaloa",
"Sonora",
"Tabasco",
"Tamaulipas",
"Tlaxcala",
"Veracruz de Ignacio de la Llave",
"Yucatán",
"Zacatecas",
"Nacido en el Extranjero"
    };

    String[] claves = {
            "AS", "BC", "BS", "CC", "CL", "CM", "CS", "CH", "DF", "DF", "DG",
            "GT", "GR", "HG", "JC", "MC", "MN", "MS", "NT", "NL", "OC", "PL",
            "QT", "QR", "SL", "SR", "SP", "TC", "TS", "TL", "VZ", "YN", "ZS", "NE"
        };
{
        System.out.println("Bienvenido a CALCULA TU CURP, ingresa los datos para continuar: ");

        System.out.println("Ingresa tu primer nombre: ");
        String primerNombre = sn.nextLine().toUpperCase();
        System.out.println("Ingresa tu segundo nombre: ");
        String segundoNombre = sn.nextLine().toUpperCase();
        System.out.println("Ingresa tu primer apellido: ");
        String primerApellido = sn.nextLine().toUpperCase();
        System.out.println("Ingresa tu segundo apellido: ");
        String segundoApellido = sn.nextLine().toUpperCase();
        System.out.println("Ingresa tu día de nacimiento (2 digitos): ");
        //DIA no puede ser menor 0 ni tampoco puede ser mayor a 31
        //Miden justo lo que necesitamos 2
        String dia = sn.nextLine();
        System.out.println("Ingresa tu mes de nacimiento (2 digitos): ");
        //Mes no puede ser menor a 0 ni tampoco puede ser mayor a 12
        //Miden justo lo que necesitamos 2
        String mes = sn.nextLine();
        System.out.println("Ingresa tu año de nacimiento (4 digitos): ");
        //Año no puede ser menor a 1900 ni tampoco puede ser mayor 2026
        //Miden justo lo que necesitamos 4
        String year = sn.nextLine();

        System.out.println("Ingresa tu sexo:\n1. Hombre\n2. Mujer ");
        int opcion = sn.nextInt();
        // esto de aqui, es un IF TERNARIO
        char sexo = opcion == 1 ? 'H' : 'M';
}
{
        String clave;
        String primerApellido;
        String segundoApellido;
        String primerNombre;
        int dia;
        int mes;
        String sexo;
        String year;

         while (true) {
            System.out.println("Ingresa el numero del estado al que correspondes:");
            // Listado de estados
            int contador = 0;
            for (String e : estados) {
                contador += 1;
                System.out.println(contador + ". " + e);
            }
            opcion = sn.nextInt();
            if (opcion < estados.length || opcion > 0) {
                clave = claves[opcion - 1];
                break;
            }
            System.out.println("Opcion invalida, vuelve a intetarlo");

        }

        String CURP = String.format("%c%c", primerApellido.charAt(0), obtenerLetra(primerApellido, true));

        if (segundoApellido.isEmpty()) {
            CURP += 'X';
        } else {
            CURP += segundoApellido.charAt(0);
        }

        CURP += primerNombre.charAt(0) +
                year.substring(2) +
                mes +
                dia +
                sexo +
                clave +
                obtenerLetra(primerApellido.substring(1), false);

        if (segundoApellido.isEmpty()) {
            CURP += 'X';
        } else {
            CURP +=obtenerLetra(segundoApellido.substring(1), false);
        }
        Random r = new Random();
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        CURP += String.format("%c%c%d",obtenerLetra(primerNombre.substring(1), false), letters[r.nextInt(27)],r.nextInt(10));

        System.out.println("Esta es tu curp: " + CURP);
    }
    

    public static char obtenerLetra(String texto, boolean vocales) {
        char letra = 'X';
        for (int i = 0; i < texto.length(); i++) {
            char tempLetra = texto.charAt(i);
            if (vocales) {
                if (tempLetra == 'A' || tempLetra == 'E' || tempLetra == 'I' || tempLetra == 'O' || tempLetra == 'U') {
                    letra = tempLetra;
                    break;
                }
            } else {
                if (tempLetra != 'A' && tempLetra != 'E' && tempLetra != 'I' && tempLetra != 'O' && tempLetra != 'U') {
                    letra = tempLetra;
                    break;
                }
            }
        }
        return letra;
    } 
}
