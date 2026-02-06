package AtividadesNivel01;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int n1 = 0, n2 = 0, soma = 0;

        System.out.println("Informe Um Número: ");
        n1 = scanner.nextInt();

        System.out.println("\nInforme Mais Um Número: ");
        n2 = scanner.nextInt();

        soma = n1 + n2;

        System.out.println("\nA soma dos números é: "+soma);


    }
}
