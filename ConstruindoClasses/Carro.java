package ConstruindoClasses;

public class Carro {
    //Atributos, representam o objeto carro
    private String marca;
    private String modelo;
    private int ano;
    public String cor;

    //Construtor, SEM parâmetros.
    public Carro(){
        this.marca = "Indefinido"; //no construtor sem parâmentros vc pode usar this ou não!
        this.modelo = "Indefinido";
        ano = 0;
        cor = "indefinido";
    }

    //Contrutor , COM parâmetros.
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca; // this representa marca do ATRIBUTO (this.marca) e = marca representa o construtor public Carro(String marca,)
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    //Getters Setters , permite visualizar ou mudar informações dos objetos.
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
