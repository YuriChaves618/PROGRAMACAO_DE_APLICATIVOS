package AtividadeNivel05;
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        char caracter;

        System.out.println("Digite um Caracter");
        caracter = scanner.next().charAt(0);

        System.out.println("O caracter digitado foi: "+caracter);
    }
}
