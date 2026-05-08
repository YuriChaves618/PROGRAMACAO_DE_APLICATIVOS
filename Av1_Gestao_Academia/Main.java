import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 10;
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        List<Treino> treinos = new ArrayList<>();
        List<Plano> planos = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Instrutor> instrutores = new ArrayList<>();

        Aluno aluno = new Aluno();
        Instrutor instrutor = new Instrutor();
        Treino treino = new Treino();
        Plano novoPlano = new Plano();

        do {
            System.out.println("\n=== SISTEMA DE GESTÃO DE ACADEMIA ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Instrutor");
            System.out.println("3 - Cadastrar Plano");
            System.out.println("4 - Criar Treino");
            System.out.println("5 - Associar Treino a Aluno");
            System.out.println("6 - Listar Pessoas");
            System.out.println("7 - Listar Planos");
            System.out.println("8 - Listar Treinos");
            System.out.println("0 - Sair do sistema");
            System.out.print("Selecione uma opção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    aluno.cadastrarAluno(scanner, pessoas, alunos);
                    break;
                case 2:
                    instrutor.cadastrarInstrutor(scanner, pessoas, instrutores);
                    break;
                case 3:
                    novoPlano.cadastrarPlano(planos);
                    System.out.println("Valor total do Plano: R$ " + novoPlano.calcularValorTotal());
                    break;
                case 4:
                    treino.criarTreino(instrutores, scanner, treinos);
                    break;
                case 5:
                    aluno.associarTreinoAluno(scanner, pessoas, treinos, alunos);
                    break;
                case 6:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa foi encontrada");
                    } else {
                        System.out.println("\n=== Lista de Pessoas Cadastradas ===");
                        for (Pessoa p1 : pessoas) {
                            p1.exibirDados();
                            System.out.println("------------------------------------");
                        }
                    }
                    break;
                case 7:
                    novoPlano.exibirPlano(planos);
                    break;
                case 8:
                    treino.exibirTreino(treinos);
                    break;
                case 0:
                    System.out.println("Finalizando o sistema...");
                    break;
                default:
                    System.out.println("Selecione uma opção válida.");
                    break;
            }
        } while (op != 0);
    }
}
