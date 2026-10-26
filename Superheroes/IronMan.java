import java.util.ArrayList;


    public class IronMan extends SuperHeroes{
        IronMan(String nombre, String superPoder, ArrayList<Ataque> ataques, int vida, int defensa){
            super(nombre, superPoder, ataques, vida, defensa);
        }

        //El tipo de anoración que se muestra se la llama "decoradores"
        @Override
        public void especial(){
            System.out.println("Invoca la jodida hulk buster y aumenta su vida en 50pts");
        }
    }

