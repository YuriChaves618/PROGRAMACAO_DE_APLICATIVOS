package AtividadesNivel02;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        float n1 = 0, n2 = 0, media = 0;

        System.out.println("Informe Um Número");
        n1 = scanner.nextFloat();

        System.out.println("Informe Mais Um Número:");
        n2 = scanner.nextFloat();

        media = (n1 + n2)/2;

        System.out.println("A Média Dos Dois Números é: "+media);


    }
}
