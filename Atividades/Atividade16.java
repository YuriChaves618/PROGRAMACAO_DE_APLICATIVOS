package ProgramaçãoDeAplicativos.ListaVariaveis;
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        double preco = 0,valorfinal = 0;
        int qtd = 0;

        System.out.println("=== Gerenciamento de Produtos ===");
        System.out.println("\nInforme o nome do Produto");
        nome = scanner.next();

        System.out.println("Informe o Preço do Produto");
        preco = scanner.nextDouble();
        System.out.println("Informe a Quantidade que foi Comprada");
        qtd = scanner.nextInt();

        valorfinal = preco * qtd;

        System.out.println("Nome do Produto....: "+nome);
        System.out.println("Preço..............: R$"+preco);
        System.out.println("Quantidade Comprada: "+qtd);
        System.out.println("Valor Final........: R$"+valorfinal);


    }
}
