package Atividades;
/*
1 - Classe Círculo:
Crie uma classe Circulo que represente um círculo com atributos como raio, área e métodos para calcular a
área e o perímetro.
*/
public class Circulo {
    //Atributos
    private double raio;
    //Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }
    //Metodos
    public double calcularArea(){
       return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro(){
        return  2 * (Math.PI * raio);
    }
    //Classe Main
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("A área do círculo é: " + circulo.calcularArea());
        System.out.println("O perímetro do círculo é: " + circulo.calcularPerimetro());
    }


}
