package Atividades;
/*
5 - Classe Animal:
Desenvolva uma classe Animal com características como nome, tipo de alimentação e metodo para emitir
som.
*/
public class Animal {
    public String nome;
    public String alimentacao;

    public Animal(String nome, String alimentacao) {
        this.nome = nome;
        this.alimentacao = alimentacao;
    }

    public void emitirSom(){
        System.out.println(nome + " esta fazendo um som.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", "Carnivoro");
        animal.emitirSom();
    }
}
