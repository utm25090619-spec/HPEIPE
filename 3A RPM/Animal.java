 public class Animal {
    String nombre;
    String Especie;
    String Raza;
    int edad;
    float peso;
    String alimentacion;
    char sexo;
    String habitad;
    String enPeligroExtincion;
    String estadoSalud;
    public Animal( String nombre, String Especie, String Raza, int edad, float peso,
                   String alimentacion, char sexo, String habitad, String esDomestico, String enPeligroExtincion , String estadoSalud ) {
        this.nombre = nombre;
        this.Especie = Especie;
        this.Raza = Raza;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.alimentacion = alimentacion;
        this.habitad = habitad;
        this.enPeligroExtincion = enPeligroExtincion;
        this.estadoSalud = estadoSalud;
    }

    public void hacerSonido() {
        System.out.println(nombre + " está haciendo un sonido característico de su especie (" + Especie + ").");
    }

    public void comer(String comida) {
        System.out.println(nombre + " está comiendo " + comida + ".");
    }

    public void desplazarse() {
        System.out.println(nombre + " se está desplazando por su hábitat (" + habitad + ").");
    }

    public void mostrarInformacion() {
        System.out.println("======= INFORMACIÓN DEL ANIMAL =======");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + Especie);
        System.out.println("Raza: " + Raza);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Sexo: " + sexo);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Hábitad: " + habitad);
        System.out.println("Esta en peligro de extincion : " + enPeligroExtincion);
        System.out.println("Estado de Salud: " + estadoSalud);
        System.out.println("====================================");
    }

    public static void main() {
        Animal animal1 = new Animal("Max", "Perro", "Golden Retriever", 5, 30.5f, 'h', "Omnívoro", "Casa", "No", "Saludable");
        Animal animal2 = new Animal("Simba", "León", "Africano", 8, 190.0f, 'm', "Carnívoro", "Sabana", "no", "Excelente");
        Animal animal3 = new Animal("Felix", "Gato", "Siamés", 2, 4.2f, 'h', "Carnívoro", "Departamento", "no", "Vacunado");
        Animal animal4 = new Animal("Mary", "Conejo", "Holandés Enano", 1, 1.5f, 'm', "Herbívoro", "Jardín", "si", "En observación");
        Animal animal5 = new Animal("Kiko", "Loro", "Cabeza Amarilla", 12, 0.9f, 'h', "Herbívoro", "Selva", "si", "Saludable");

    }
}
}

