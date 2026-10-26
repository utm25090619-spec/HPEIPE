import java.util.ArrayList;

public class Hulk extends SuperHeroes{
    Hulk(String nombre, String superPoder, ArrayList<Ataque> ataques, int vida, int defensa){
     super(nombre, superPoder, ataques, vida, defensa);
    }

    //El tipo de anoración que se muestra se la llama "decoradores"
    @Override
    public void especial(){
        System.out.println("*Se pega en el dedito chiquito del pie y se emperra más");
    }
}
