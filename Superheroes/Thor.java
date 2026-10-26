import java.util.ArrayList;

public class Thor extends SuperHeroes{
    Thor(String nombre, String superPoder, ArrayList<Ataque> ataques, int vida, int defensa){
        super(nombre, superPoder, ataques, vida, defensa);
    }

    //El tipo de anoración que se muestra se la llama "decoradores"
    @Override
    public void especial(){
        System.out.println("Le pide su martillo a bob el constructor y aumenta su ataque en 50pts");
    }
}