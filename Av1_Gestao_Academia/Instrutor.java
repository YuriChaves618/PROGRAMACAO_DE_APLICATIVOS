import java.util.List;
import java.util.Scanner;

public class Instrutor extends Pessoa {
    private String cref;
    private String especialidade;

    public Instrutor() {
    }

    public Instrutor(String nome, String cpf, String cref, String especialidade) {
        super(nome, cpf);
        this.cref = cref;
        this.especialidade = especialidade;
    }

    public String getCref() {
        return this.cref;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CREF: " + this.cref);
    }

    public void cadastrarInstrutor(Scanner scanner, List<Pessoa> pessoas, List<Instrutor> instrutores) {

        System.out.println("\n=== CADASTRAR INSTRUTOR ===");

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("CPF: ");
        String cpf = scanner.next();

        for (Pessoa pessoa : pessoas) {
            // Verificação para ver se a pessoa (instrutor) já existe no sistema.
            if (pessoa.getCpf().equals(cpf)) {
                System.out.println("CPF já cadastrado.");
                return;
            }
        }

        System.out.print("CREF: ");
        String cref = scanner.next();

        System.out.print("Especialidade: ");
        String especialidade = scanner.next();

        // Criando o objeto Instrutor (considerando a versão com extends Pessoa)
        Instrutor instrutor = new Instrutor(nome, cpf, cref, especialidade);

        // Adiciona na lista de pessoas (polimorfismo: Instrutor é uma Pessoa)
        pessoas.add(instrutor);
        instrutores.add(instrutor);

        System.out.println("Instrutor cadastrado com sucesso.");
    }
}
