package Atividades;
/*
4 - Classe Retângulo:
Implemente uma classe Retangulo com atributos como comprimento, largura e métodos para calcular a
área e o perímetro.
*/

public class Retangulo {
    public double comprimento;
    public double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea(){
        return  largura * comprimento;
    }

    public double calcularPerimetro(){
        return 2 * (largura + comprimento);
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(6.8, 4.2);
        System.out.println("A área do retângulo é: " + retangulo.calcularArea());
        System.out.println("O perimetro do retângulo é: " + retangulo.calcularPerimetro());
    }
}
