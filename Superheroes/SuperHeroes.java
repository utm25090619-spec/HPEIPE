import java.util.ArrayList;     

public class SuperHeroes {    
    String nombre;
    String superPoder;
    ArrayList<Ataque> ataques;    
    int vida;
    int defensa;

    public static class Ataque{
        String nombre;
        int damage;
        int cantidadEnergia;

        Ataque(String nombre, int damage, int cantidadEnergia){
        this.nombre = nombre;
        this.damage = damage;
        this.cantidadEnergia = cantidadEnergia;
    }
    }


    SuperHeroes(String nombre, String superPoder, ArrayList<Ataque> ataques, int vida, int defensa){
        this.nombre = nombre;
        this.superPoder = superPoder;
        this.ataques = ataques;
        this.vida = vida;
        this.defensa = defensa;
    }

    public void getInfo(){
        /*Creamos una variable que imprima la informacion de manera inyectada, para eso sirve "String.format"
        cada simbolo de %s o %d, representa una variable a inyectar, después de crear el string (solo lo que esta entré comillas)
        va cada datos a inyectar JUSTO EN EL ORDEN QUE USTEDES LO DECLARARON
        En este caso primero va nombre, luego superpoder y así sucesivamente.
        */  
        String data = String.format("%s es un super heroe con el poder de %s \n Sus stats son:\nVida: %d\nDefensa: %d",
            this.nombre, this.superPoder, this.vida, this.defensa);
            //si '%i'no lo reconoce el sistema '%d' también puede funcionar.
            System.out.println(data);
            System.out.println("Ataques relacionados:");
            //Es pasar ataque por ataque y mostrar la información de cada ataque

            for(Ataque a : this.ataques){
                String infoAtaque  = String.format("Nombre: %s\nDaño:%d\nEnergiaa consumir: %d", a.nombre, a.damage, a.cantidadEnergia);
                System.out.println(infoAtaque);
            }
    }

    public void atacar(SuperHeroes enemigo){
    }

    public void especial(){

    }
    
}
