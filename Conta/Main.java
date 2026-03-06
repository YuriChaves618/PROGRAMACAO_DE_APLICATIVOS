package ContaBancaria;
import java.util.Scanner;
import  ContaBancaria.Conta_Bancaria;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op = 0;

        Conta_Bancaria contabancaria = new Conta_Bancaria();


        do {

            System.out.println("\n=== Conta Bancária ===");
            System.out.println("1. Depositar");
            System.out.println("2. Conferir Saldo Disponível");
            System.out.println("3. Sacar");
            System.out.println("4. Sair do Programa");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    contabancaria.Deposito();
                    break;
                case 2:
                    System.out.println("Seu Saldo Atual é: "+contabancaria.getSaldo());
                    break;
                case 3:
                    contabancaria.Sacar();
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    scanner.nextLine();
                    break;
            }
        }while(op != 4);
    }
}

