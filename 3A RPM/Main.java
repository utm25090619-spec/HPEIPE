public class Main {
    public static void Main(){
        Persona  persona1 = new Persona("juan de dios","santna","guevara",14,02,2000,"aguascalientes",'h',"almacen");
        persona1.name = "Juan";
        persona1.apepat = "Santana";
        persona1.apemat = "Guevara";
        persona1.diaNaciemiento = 14;
        persona1.mesNaciemiento = 02;
        persona1.yearNaciemiento = 2000;
        persona1.estado = "Aguascaliente";
        persona1.sexo = 'H';
        persona1.area = "Almacen";

        System.out.println(persona1.name);
        System.out.println(persona1.apepat);
        System.out.println(persona1.apemat);
        System.out.println(persona1.diaNaciemiento);
        System.out.println(persona1.mesNaciemiento);
        System.out.println(persona1.yearNaciemiento);
        System.out.println(persona1.estado);
        System.out.println(persona1.sexo);
        System.out.println(persona1.area);

        persona1.trabajar();

        Persona persona2 = new Persona("ziggy","grover","Ranger",22,08,1990,"khorinthia",'h',"Domo");
        persona2.name = "Ziggy";
        persona2.apepat = "Grover";
        persona2.apemat = "Ranger";
        persona2.diaNaciemiento = 22;
        persona2.mesNaciemiento = 08;
        persona2.yearNaciemiento = 1990;
        persona2.estado = "Korinthia";
        persona2.sexo = 'H';
        persona2.area = "Domo";

        persona1.saludar(persona2.);

    }
}