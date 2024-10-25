package Atividades;
/*
3 - Classe Livro:
Crie uma classe Livro com atributos como título, autor, número de páginas e metodo para exibir detalhes
do livro.
*/

public class Livro {
    public String titulo;
    public String autor;
    public int numeroDePaginas;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void exibirDetalhesLivro(){
        System.out.println("Nome do Livro: " + titulo + " / Autor: " + autor + " / Páginas:" + numeroDePaginas);
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Memórias de uma Gueixa", "Arthur Golden", 464);

        livro.exibirDetalhesLivro();
    }

}
