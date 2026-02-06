package AtividadesNivel03;
import java.util.Scanner;

public class Atividade09 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        String nome = "", cidade = "";

        System.out.println("Informe Seu Nome");
        nome = scanner.next();
        System.out.println("Informe Sua Cidade");
        cidade = scanner.next();

        System.out.println("\n O cidadão "+nome+" Reside na cidade de "+cidade);
    }
}
