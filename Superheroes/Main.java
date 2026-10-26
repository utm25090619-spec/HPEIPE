import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
    String[] nombreHeroes = {"El Barto", "Hombre Pay", "Sentry", "El señor de la noche"};
    String[] poderes = {"Radioactividad", "Altruismo", "Poder Solar", "Intuición"};
    String[] nombresAtaques = {"Lanzarrocas","Explosión Eonica", "Pay de la Justicia", "Batarang", "Rayo solar"};

    ArrayList<SuperHeroes> heroes = new ArrayList<>();

    for(int i = 0; i < 50; ++i){
        ArrayList<SuperHeroes.Ataque> ataques = new ArrayList<>();
        for(int j = 0; j < 4; ++i){
            String nombreAtaque = nombresAtaques[rand.nextInt(nombresAtaques.length)];
            int damage = 10 + rand.nextInt(50);
            int energia = 5 + rand.nextInt(40);
            ataques.add(new SuperHeroes.Ataque(nombreAtaque, damage, energia));
            
        }

        String nombre = nombresAtaques[rand.nextInt(nombreHeroes.length)] + " " + + i;
        String poder = poderes[rand.nextInt(poderes.length)];
        int vida = 50 + rand.nextInt();
        int defensa = 10 + rand.nextInt();

        SuperHeroes heroe = new SuperHeroes(nombre, poder, ataques, vida, defensa);
        heroes.add(heroe);
    }

    for(SuperHeroes h : heroes){
        h.getInfo();
        System.out.println("--------------------");
    }

    ArrayList<SuperHeroes.Ataque> ataquesIronMan            = new ArrayList<SuperHeroes.Ataque>();
    SuperHeroes.Ataque ataque1 = new SuperHeroes.Ataque("Alcoholismo", -30, 5);
    SuperHeroes.Ataque ataque2 = new SuperHeroes.Ataque("Yarbis pásame el deste sobre la esta", 40, 10);

    ArrayList<SuperHeroes.Ataque> ataquesSuperiorSpiderMan  = new ArrayList<SuperHeroes.Ataque>();
    SuperHeroes.Ataque ataque3 = new SuperHeroes.Ataque("Se hace bolita y llora", 20, 10);
    SuperHeroes.Ataque ataque4 = new SuperHeroes.Ataque("Te calla el perro hocico con telarañas", 30, 20);

    ArrayList<SuperHeroes.Ataque> ataquesThor               = new ArrayList<SuperHeroes.Ataque>();
    SuperHeroes.Ataque ataque5 = new SuperHeroes.Ataque("Rayo byfrost jotificador", 40, 5);
    SuperHeroes.Ataque ataque6 = new SuperHeroes.Ataque("Insultar a NoobMaster69", 20, 10);

    ArrayList<SuperHeroes.Ataque> ataquesDoctorStrange      = new ArrayList<SuperHeroes.Ataque>();
    SuperHeroes.Ataque ataque7 = new SuperHeroes.Ataque("Abre un portal a perú", 130, 5);
    SuperHeroes.Ataque ataque8 = new SuperHeroes.Ataque("Dormamu, he venido para negociar", 40, 10);

    ArrayList<SuperHeroes.Ataque> ataquesHulk               = new ArrayList<SuperHeroes.Ataque>();
    SuperHeroes.Ataque ataque9 = new SuperHeroes.Ataque("Ya no hay buenos juegos en la playstore", -30, 5);
    SuperHeroes.Ataque ataque10 = new SuperHeroes.Ataque("Patada nuclear", 40, 10);


    SuperHeroes ironMan = new SuperHeroes("Tony Stark", "Armadura de fierro", ataquesIronMan, 60, 40);

    SuperHeroes superiorSpiderman = new SuperHeroes("Peter Parker (Octavius)", "Arañame esta", ataquesSuperiorSpiderMan, 80, 40);

    SuperHeroes thor = new SuperHeroes("Thor Odinson", "Rashos", ataquesThor, 1000, 500);

    SuperHeroes doctorStrange = new SuperHeroes("Steven Strange", "Ser un pinche nerd de la magia con el guión de su lado", ataquesThor, 60, 20);

    SuperHeroes hulk = new SuperHeroes("Hulk", "Estar bien pinche mamado", ataquesHulk, -1000, 500);

    //Crear un arreglo donde estén todos los heroes y mostrar la informacipon de cada uno con un ciclo

        ArrayList<SuperHeroes> heroesMarvel = new ArrayList<SuperHeroes>();
        heroesMarvel.add(ironMan);
        heroesMarvel.add(superiorSpiderman);
        heroesMarvel.add(thor);
        heroesMarvel.add(doctorStrange);
        heroesMarvel.add(hulk);

        for (SuperHeroes heroe : heroesMarvel) {
            heroe.getInfo();
            System.out.println("------------------------");
        }


    boolean bugs = false;
    int lag = 0;
    String Historia = "Perrona";
    String Graficos = "Unreal Engine70";
    boolean rejugabilidad = true;
    int fps = 144;
    }
    
}