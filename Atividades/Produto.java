package Atividades;
/*
6 - Classe Produto:
Crie uma classe Produto com atributos como nome, preço e metodo para calcular o preço com desconto.
*/
public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoComDesconto(){
        double desconto = 0.10;
        return preco * desconto;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Notebook Acer", 4500.00);

        System.out.println("O " + produto.nome + " esta custando R$: " + produto.preco);
        System.out.println("Você recebeu um desconto de 10% ");
        System.out.println("O valor com desconto é de R$: " + (produto.preco - produto.calcularPrecoComDesconto()));
    }
}
