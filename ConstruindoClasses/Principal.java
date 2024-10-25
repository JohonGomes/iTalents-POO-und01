package ConstruindoClasses;

public class Principal {
    public static void main(String[] args) {
        //Construindo o objeto Carro
        Carro carro = new Carro("BMW", "320i", 2022, "Preto");
        Carro carro2 = new Carro("Volksvagem", "Jetta", 2024, "Prata");

        //Exibindo as informações do objeto Carro.
        System.out.println("Marca:  " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano:    " + carro.getAno());
        System.out.println("Cor:    " + carro.getCor());
        System.out.println("");

        System.out.println("Marca:  " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano:    " + carro2.getAno());
        System.out.println("Cor:    " + carro2.getCor());
        System.out.println("");

        //Modificando valores do objeto (o atributo cor esta público por isso permite alteração).
        carro.cor="Verde";
        carro.setCor("Azul"); // jeito correto de fazer.
        System.out.println("Cor:    " + carro.getCor());


    }
}
