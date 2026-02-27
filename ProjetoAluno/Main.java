package ProjetoAluno;
import java.util.Scanner;
import ProjetoAluno.Aluno;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        Aluno alunos[] = new Aluno[5];

        System.out.println("\n=== Cadastro de Alunos ===");

        for(int i = 0; i < alunos.length;i++){
            alunos[i] = new Aluno();

            System.out.println("Informe o nome do Aluno ");
            alunos[i].setNome(scanner.next());
            System.out.println("Informe a idade do Aluno ");
            alunos[i].setIdade(scanner.nextInt());
            System.out.println("Informe a Matrícula do Aluno ");
            alunos[i].setMatricula(scanner.next());

        }

        System.out.println("\nAlunos cadastrados\n");

        for( Aluno Pessoas : alunos){
            System.out.println("Nome: "+ Pessoas.getNome() + " " +"| Número de Matrícula: "+Pessoas.getMatricula() + " "+"| Idade: "+ Pessoas.getIdade());
        }

    }
}
