import java.util.ArrayList;

public class SuperiorSpiderMan extends SuperHeroes{
    SuperiorSpiderMan(String nombre, String superPoder, ArrayList<Ataque> ataques, int vida, int defensa){
        super(nombre, superPoder, ataques, vida, defensa);
    }

    //El tipo de anoración que se muestra se la llama "decoradores"
    @Override
    public void especial(){
        System.out.println("Lo controla Olvier Tree y te pega el oininoinoi en la cabeza");
    }
}
