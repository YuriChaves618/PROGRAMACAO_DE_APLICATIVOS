package Banco;
import java.util.Scanner;
import Banco.ContaBancaria;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria("4356","Deivid da Luz",0);
        int op = 0;

        System.out.println("\n=== Sistema de Contas Bancárias ===");

        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Conferir Saldo");
            System.out.println("4. Sair");
            System.out.println("Informe a opção desejada");
            op = scanner.nextInt();

            switch(op){
                case 1:
                    System.out.println("Informe o valor que deseja depositar");
                    contaBancaria.Deposito(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja sacar");
                    contaBancaria.Sacar(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Saldo atual: "+contaBancaria.getSaldo());
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }


        }while(op != 4);

    }

