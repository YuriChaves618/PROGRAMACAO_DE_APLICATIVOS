import Exercicio01.CartaoCredito;
import Exercicio01.Pix;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int op = 0;

    CartaoCredito cartaoCredito = new CartaoCredito();
    Pix pix = new Pix();

        System.out.println("Formas de Pagamento");
        System.out.println("1. Cartão");
        System.out.println("2. Pix");
        op = scanner.nextInt();

        switch(op) {
            case 1:
            cartaoCredito.cadastrarCartao();
            cartaoCredito.pagar(564);
            break;

            case 2:
                pix.pagar(76);
                break;

        }


    }
}
