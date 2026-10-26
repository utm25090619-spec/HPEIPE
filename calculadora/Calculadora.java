
public class Calculadora {
    String forma;
    String color;
    String marca;
    String tipo;

    Calculadora(
        String c,
        String f,
        String m,
        String t 
    ){
        this.color = c;
        this.forma = f;
        this.marca = m;
        this.tipo = t;
    }

float sumar(float n1, float n2){
    return n1 + n2;
}
float resta(float n1, float n2){
    return n1 - n2;
}
float multi(float n1, float n2){
    return n1 * n2;
}
    float division(float n1, float n2){
    return n1 / n2;
}
}