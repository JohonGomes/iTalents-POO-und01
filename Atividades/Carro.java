package Atividades;
/*
9 - Classe Carro:
Crie uma classe Carro com atributos como marca, modelo, ano e métodos para ligar, desligar e acelerar.
*/

public class Carro {
    public String marca;
    public String modelo;
    public String ano;

    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar(){
        System.out.println("Ligou o carro!");
    }

    public void desligar(){
        System.out.println("Desligou o carro");
    }

    public void acelerar(){
        System.out.println("Acelerou o carro");
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", "2000");

        System.out.println("Marca do Carro: "+ carro.marca + " Modelo: " + carro.modelo + " Ano:" + carro.ano);
       carro.ligar();
       carro.acelerar();
       carro.desligar();
    }
}
