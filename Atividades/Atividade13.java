package AtividadeNivel05;
import java.util.Scanner;

public class Atividade13 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String nome = "";

        System.out.println("Informe um nome: ");
        nome = scanner.next();

        System.out.println("A primeira Letra do nome Informado é: "+nome.charAt(0));


    }
}
