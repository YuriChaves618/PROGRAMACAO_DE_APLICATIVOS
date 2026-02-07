package ProgramaçãoDeAplicativos.ListaVariaveis;
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        String nome = "";
        double av1 = 0, av2 = 0, media = 0;

        System.out.println("=== Sistema de Notas ===");
        System.out.println("\nInforme o Nome do Aluno: ");
        nome = scanner.next();
        System.out.println("Informe a Av1 do Aluno: ");
        av1 = scanner.nextDouble();
        System.out.println("Informe a Av2 do Aluno: ");
        av2 = scanner.nextDouble();

        media = (av1 + av2)/2;

        System.out.println("Aluno: "+nome+" Média Final: "+media);



    }
}
