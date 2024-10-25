package ModificadoresDeAcesso.pacote01;

import ModificadoresDeAcesso.pacote02.Carro;

public class Exemplo01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Produto produto = new Produto();
        Carro carro = new Carro();

        pessoa.setNome("Johon");
        pessoa.setIdade(37);

        System.out.println(pessoa.nome); //public, funciona dentro do mesmo pacote.
        System.out.println(pessoa.idade); //protected, funciona dentro do mesmo pacote.
        System.out.println("");
        //System.out.println(pessoa.peso); //da erro visibilidade protegido


        produto.setNome("Macarrão");
        produto.setPreco(10.50);

        System.out.println(produto.nome);
        System.out.println(produto.preco);
        System.out.println("");
        //System.out.println(produto.peso); //da erro visibilidade protegido

        carro.setMarca("Fiat");

        System.out.println(carro.marca);
        //System.out.println(carro.modelo); // protected somente dentro do mesmo pacote
        //System.out.println(carro.cor); //

    }
}
