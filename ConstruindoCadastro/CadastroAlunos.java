package ConstruindoCadastro;  // Define o pacote onde a classe está localizada

import java.util.ArrayList;    // Importa a classe ArrayList para usar listas
import java.util.Scanner;      // Importa a classe Scanner para ler entrada do usuário

public class CadastroAlunos {  // Define a classe principal CadastroAlunos
    // Declara uma lista privada que vai armazenar objetos do tipo Aluno
    private ArrayList<Aluno> alunos;

    // Construtor da classe - é chamado quando criamos um novo objeto CadastroAlunos
    public CadastroAlunos(){
        alunos = new ArrayList<>();  // Inicializa a lista vazia de alunos
    }

    // Metodo que recebe um objeto Aluno e adiciona na lista
    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);  // Adiciona o aluno à lista
    }

    // Metodo que mostra todos os alunos cadastrados
    public void mostrarAlunos(){
        // Loop foreach que percorre cada aluno na lista
        for (Aluno aluno : alunos){
            // Imprime os dados de cada aluno usando os getters
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("");  // Linha em branco para separar os alunos
        }
    }

    // Metodo principal (main) - ponto de entrada do programa
    public static void main(String[] args) {
        CadastroAlunos cadastro = new CadastroAlunos();  // Cria um novo objeto de cadastro
        Scanner scanner = new Scanner(System.in);         // Cria um scanner para ler entrada do usuário

        boolean continuar = true;  // Variável de controle do loop principal

        // Loop principal do programa
        while(continuar){
            // Mostra o menu de opções
            System.out.println("--- Escolha uma opção abaixo: ---");
            System.out.println("1- Cadastrar aluno");
            System.out.println("2- Mostrar alunos cadastrados");
            System.out.println("3- Sair");

            int opcao = scanner.nextInt();     // Lê a opção escolhida
            scanner.nextLine();                // Limpa o buffer do scanner

            // Switch para tratar cada opção do menu
            switch (opcao){
                case 1:  // Opção de cadastrar aluno
                    // Lê os dados do aluno
                    System.out.print("Informe o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe a idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();  // Limpa o buffer
                    System.out.print("Informe o curso do aluno: ");
                    String curso = scanner.nextLine();

                    // Cria um novo aluno e cadastra
                    cadastro.cadastrarAluno(new Aluno(nome, idade, curso));
                    System.out.println("Aluno cadastrado com sucesso");
                    break;

                case 2:  // Opção de mostrar alunos
                    System.out.println("Alunos Cadastrados: ");
                    cadastro.mostrarAlunos();
                    break;

                case 3:  // Opção de sair
                    continuar = false;  // Muda a variável de controle para encerrar o loop
                    break;

                default:  // Opção inválida
                    System.out.println("Opção inválida!!!");
                    break;
            }
        }
        scanner.close();  // Fecha o scanner
        System.out.println("Programa Encerrado!");  // Mensagem final
    }
}