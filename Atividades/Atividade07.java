package AtividadesNivel02;
import java.util.Scanner;

public class Atividade07 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double produto = 0, qtd = 0, Valor_Final;

        System.out.println("=== Loja Virtual ===");
        System.out.println("\nAdicione o valor do seu primeiro produto: ");
        produto = scanner.nextDouble();

        System.out.println("\nQuantos Exemplares foram vendidos deste produto ?");
        qtd = scanner.nextDouble();

        Valor_Final = produto * qtd;

        System.out.println("O valor total vendido foi de: R$"+Valor_Final);

    }
}
