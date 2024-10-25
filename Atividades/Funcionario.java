package Atividades;
/*
10 - Classe Funcionário:
Implemente uma classe Funcionario com características como nome, cargo, salário e metodo para calcular
aumento de salário.
*/

public class Funcionario {
    public String nome;
    public String cargo;
    public double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double valor){
        salario += valor;
        System.out.println("Seu novo salário é de R$ " + salario);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Johon", "Desenvolvedor Java", 6000.00);

        funcionario.aumentarSalario(1000.00);
    }
}
