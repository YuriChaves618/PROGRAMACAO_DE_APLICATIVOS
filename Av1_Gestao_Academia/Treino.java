import java.util.List;
import java.util.Scanner;

public class Treino {

    private String descricao;
    private String nivel;
    private Instrutor instrutorResponsavel;

    // Construtor vazio
    public Treino() {

    }

    // Construtor com parâmetros
    public Treino(String descricao, String nivel, Instrutor instrutorResponsavel) {
        this.descricao = descricao;
        setNivel(nivel);
        this.instrutorResponsavel = instrutorResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    // validação do nível
    public void setNivel(String nivel) {
        if (nivel.equalsIgnoreCase("iniciante") ||
                nivel.equalsIgnoreCase("intermediario") ||
                nivel.equalsIgnoreCase("avancado")) {

            this.nivel = nivel;
        } else {
            System.out.println("Erro: Nível inválido! Use iniciante, intermediário ou avançado.");
        }
    }

    public Instrutor getInstrutorResponsavel() {
        return instrutorResponsavel;
    }

    public void setInstrutorResponsavel(Instrutor instrutorResponsavel) {
        this.instrutorResponsavel = instrutorResponsavel;
    }

    public void criarTreino(List<Instrutor> instrutores, Scanner scanner, List<Treino> treinos) {

        System.out.print("Digite a descrição do treino: ");
        this.descricao = scanner.next();

        // validação do nível
        while (true) {
            System.out.print("Digite o nível (iniciante/intermediario/avancado): ");
            String nivelDigitado = scanner.next();

            if (nivelDigitado.equalsIgnoreCase("iniciante") || nivelDigitado.equalsIgnoreCase("intermediario")
                    || nivelDigitado.equalsIgnoreCase("avancado")) {
                this.nivel = nivelDigitado;
                break;
            } else {
                System.out.println("Nível inválido! Tente novamente.");
            }
        }

        System.out.println("\nInstrutores disponíveis:");

        if(instrutores.isEmpty()) {
            System.out.println("Sem instrutores disponíveis.");
            return;
        }
        for (int i = 0; i < instrutores.size(); i++) {
            System.out.println(i + " - " + instrutores.get(i).getNome());
        }

        int opcao = 0;

        while (true) {
            System.out.print("Digite o número do instrutor: ");
            opcao = scanner.nextInt();

            if (opcao >= 0 && opcao < instrutores.size()) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        this.instrutorResponsavel = instrutores.get(opcao);

        Treino treinoNovo = new Treino(this.descricao, this.nivel, this.instrutorResponsavel);
        treinos.add(treinoNovo);

        System.out.println("Treino criado.");
    }

    public void exibirTreino(List<Treino> treino) {
        for (int i = 0; i < treino.size(); i++) {
            System.out.println("Descrição: " + treino.get(i).getDescricao());
            System.out.println("Nível: " + treino.get(i).getNivel());
            System.out.println("Instrutor: " + treino.get(i).getInstrutorResponsavel().getNome());
            System.out.println("-------------------------------------");
        }
    }

    public void selecionarTreino() {
        System.out.println("Treino selecionado: " + descricao);
    }
}
