package SistemaDeNotas;
import java.util.Scanner;
import SistemaDeNotas.Aluno;

public class Main {
    public static void main(String[] args){
        Aluno[] alunos = new Aluno[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Notas ===");

        for(int i = 0; i < alunos.length; i++){

            double []avaliacoes = new double[3];
            alunos[i] = new Aluno();

                System.out.println("\nInforme o nome do Aluno:");
                alunos[i].setNome(scanner.nextLine());
                System.out.println("Informe a Av1 do Aluno");
                avaliacoes[0] = scanner.nextDouble();
                System.out.println("Informe a Av2 do Aluno");
                avaliacoes[1] = scanner.nextDouble();
                System.out.println("Informe a Av3 do Aluno");
                avaliacoes[2] = scanner.nextDouble();

                if((avaliacoes[0] < 0 || avaliacoes[0] > 10) || (avaliacoes[1] < 0 || avaliacoes[1] > 10)
                        || (avaliacoes[2] < 0 || avaliacoes[2] > 10)){
                        System.out.println("Informações Inválidas!");
                        break;
                }else {
                    alunos[i].setNotas(avaliacoes);
                    alunos[i].ExibirMedia();
                }

                break;
            }
            }
        }
