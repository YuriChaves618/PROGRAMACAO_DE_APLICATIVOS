import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private String matricula;
    private Plano plano;
    private List<Treino> treinos = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void adicionarTreino(Treino treino) {
        treinos.add(treino);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + this.matricula);
    }

    public void cadastrarAluno(Scanner scanner, List<Pessoa> pessoas, List<Aluno> alunos) {

        System.out.println("\n=== CADASTRAR ALUNO ===");

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("CPF: ");
        String cpf = scanner.next();

        for (Pessoa pessoa : pessoas) {
            // Verificação para ver se a pessoa (aluno) já existe no sistema.
            if (pessoa.getCpf().equals(cpf)) {
                System.out.println("CPF já cadastrado.");
                return;
            }
        }

        System.out.print("Matrícula: ");
        String matricula = scanner.next();

        Aluno aluno = new Aluno(nome, cpf, matricula);

        pessoas.add(aluno);

        // Adiciona na lista de pessoas que associa ao aluno (é criado na classe aluno
        // de qualquer forma).

        System.out.println("Aluno cadastrado com sucesso.");
    }

    public void associarTreinoAluno(Scanner scanner, List<Pessoa> pessoas, List<Treino> treinos, List<Aluno> alunos) {

        System.out.println("\n=== ASSOCIAR TREINO A ALUNO ===");

        // filtra somente os alunos da lista de pessoas (já que ele puxa o cadastro de
        // pessoas).
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                alunos.add((Aluno) pessoa);
            }
        }
        

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        // Falta função de cadastro de treino para funcionar essa parte e todas de
        // verificação de treino.
        if (treinos.isEmpty()) {
        System.out.println("Nenhum treino cadastrado.");
        return;
        }

        System.out.println("\nAlunos cadastrados:");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(i + ". " + alunos.get(i).getNome() + " - Matrícula: " + alunos.get(i).getMatricula());
        }

        System.out.print("Escolha o número do aluno: ");
        int numeroAluno = scanner.nextInt();

        if (numeroAluno < 0 || numeroAluno >= alunos.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("\nTreinos disponíveis:");
        for (int i = 0; i < treinos.size(); i++) {
            System.out.println(i + ". " + treinos.get(i).getDescricao() + " - Nível: " + treinos.get(i).getNivel());
        }

        System.out.print("Escolha o número do treino: ");
        int numeroTreino = scanner.nextInt();

        if (numeroTreino < 0 || numeroTreino >= treinos.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        Aluno alunoEscolhido = alunos.get(numeroAluno);
        Treino treinoEscolhido = treinos.get(numeroTreino);

        alunoEscolhido.adicionarTreino(treinoEscolhido);

        System.out.println(
                "Treino: " + treinoEscolhido.getDescricao() + ". associado ao aluno: " + alunoEscolhido.getNome());
    
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                alunos.removeAll(alunos);
            }
        }
    }
}
