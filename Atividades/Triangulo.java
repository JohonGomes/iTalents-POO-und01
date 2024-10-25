package Atividades;
/*
7 - Classe Triângulo:
Implemente uma classe Triangulo com atributos como base, altura e metodo para calcular a área.
*/

public class Triangulo {
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(6.8, 8.0);

        System.out.println("A área do triângulo é: " + triangulo.calcularArea() + " metros quadrados");
    }
}
