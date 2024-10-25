package Atividades;
/*
2 - Classe Pessoa:
Desenvolva uma classe Pessoa que tenha atributos como nome, idade e metodo para cumprimentar.
*/

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void cumprimentar(){
        System.out.println("Olá meu nome é " + nome + " tenho " + idade + " anos!!!");
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Johon", 37);
        pessoa.cumprimentar();

    }
}
