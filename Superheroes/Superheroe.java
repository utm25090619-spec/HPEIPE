package Superheroes;
import java.util.ArrayList;

public class Superheroe {
    String nombre;
    String superPoder;
    ArrayList<Ataque> ataques;
    int vida;
    int defensa;

    public static  class Ataque{
       String nombre;
       int damage;
       int cantidadEnergia;

       Ataque(String nombre, int damage, int cantidadEnergia){
        this.nombre = nombre;
        this.damage = damage;
        this.cantidadEnergia = cantidadEnergia;
       }

       void getInfo(){
        String infoAtaque = String.format("Nombre: %s \nDaño: %d \nEnergia a conssumir: %d",
                this.nombre, this.damage, this.cantidadEnergia);
            System.out.println(infoAtaque);
       }
    }
    Superheroe(String nombre, String superPoder, ArrayList<Ataque> ataques,
        int vida, int defensa){
            this.nombre = nombre;
            this.superPoder = superPoder;
            this.ataques = ataques;
            this.vida = vida;
            this.defensa = defensa;
    }

    public void getInfo(){
        // Creamos variable que imprima la informacion de manera inyectada, para eso sirve "String.format"
        // Cada simbolo de %s o %d, representa una variable a inyectar
        // Despues de crear el String(solo lo que  esta entre comillas)va cada dato a inyectar JUSTO EN EL ORDEN QUE USTEDES LO DECLARARON
        // En este caso primero va nombre, luego superpoder, etc...
        String data = String.format("%s es un super heroe con el poder de %s \n Sus stats son: \nVida: %d \nDefensa: %d",
          this.nombre, this.superPoder, this.vida, this.defensa);
         System.out.println(data);
         System.out.println("ataques relacionados");
         // Es pasar ataque por ataque y mostar la informacion de cda ataque
         
    }

    public void atacar(Superheroe enemigo){

    }

}
