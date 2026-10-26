import java.util.ArrayList;

public class DoctorStrange extends SuperHeroes{
    DoctorStrange(String nombre, String superPoder, ArrayList<Ataque> ataques, int vida, int defensa){
        super(nombre, superPoder, ataques, vida, defensa);
    }

    //El tipo de anoración que se muestra se la llama "decoradores"
    @Override
    public void especial(){
        System.out.println("Usa el poder de su pobreza y dá lástima (pierdes 20pts de vida)");
    }
}