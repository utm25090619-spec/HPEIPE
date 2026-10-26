 package Herencia;

import Herencia.Herencia.Animal;
import Herencia.Herencia.Borrega;
import Herencia.Herencia.Caballo;
import Herencia.Herencia.Gato;
import Herencia.Herencia.Perro;
import Herencia.Herencia.Loro;


public class Herencia { 
     // toda propiedad y atributo del padre pasa al hijo
     //en JAVA solo una clase  puede  heredar de otra. NO HAY HERENCIA MULTIPLE
     //super clase
     //clase padre
     public static class Animal {
      String nombre;

      Animal(String name){
        this.nombre = name;
      }

        public void emitirSonido( String sonido){
            System.out.println("Sonido del animal: "+ sonido);
        }
        
     }

     public static class Perro extends Animal{

        String raza;
        boolean pedigree;

     Perro(String name, String raza, boolean pedigree){
        //super es la palabra reservada para comunicarse entre padres e hijo :>
        super(name);
        this.raza = raza;
        this.pedigree = pedigree;
     }
        
     }

     public  static class Gato extends Animal {

        String color;
     
        Gato(String nombre, String color){
            super(nombre);
            this.color = color;

        }
        public void Trepar(){
            System.out.println("estoy trepando" );
        }
     }

        public void Trepar(){
            System.out.println("estoy trepando" );
        }
     
      public  static class Caballo extends Animal {

        int estaura;
     
        Caballo(String nombre, int estatura){
            super(nombre);
            this.estaura = estatura;

        }
        public void Cavalgar(){
            System.out.println("estoy cavalagando ");
        }

    }
     public  static class Borrega extends Animal {

        float peso;
     
        Borrega(String nombre, float peso){
            super(nombre);
            this.peso = peso;

        }
        public void Pastar(){
            System.out.println("estoy pastando ");
        }

        }

         public  static class Loro extends Animal {

        String Frase;
     
        Loro(String nombre, String frase){
            super(nombre);
            this.Frase = frase;

        }
        public void repetir(){
            System.out.println("estoy repitiendo la frase");
        }
    }

     public static void main() {
        Animal animal1 = new Animal("Juan" );
        Perro  perro1 = new Perro("jordi", "Doberman", true);
        Gato gato1 = new Gato("jorge", "Naranja");
        Caballo caballo1 = new Caballo("el Hueso", 175);
        Borrega borrega1 = new Borrega("juanes", 56.7f);
        Loro loro1 = new Loro("estefano", "arrghh viento en las velas, viento en las velas");

        System.out.println(animal1.nombre);
        animal1.emitirSonido("Ñyyaaaa");
        gato1.emitirSonido("miauu");
        perro1.emitirSonido("guauuuu");
        caballo1.emitirSonido("jiiiii");
        borrega1.emitirSonido("beeee");
        loro1.emitirSonido("puuergggg");
     }
        
}  

