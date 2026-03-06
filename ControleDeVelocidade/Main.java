package ControleVelocidade;
import java.util.Scanner;
import ControleVelocidade.ControleDEVelocidade;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        ControleDEVelocidade controledevelocidade = new ControleDEVelocidade("Hyundai",0,450);

        do{
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Acelerar Veículo");
            System.out.println("2. Frear Veículo");
            System.out.println("3. Sair do Programa");
            System.out.println("Digite a opção desejada");
            op = scanner.nextInt();

            switch(op){
                case 1:
                    System.out.println("Informe a velocidade que você quer acelerar");
                    controledevelocidade.Aceleracao(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Informe a velocidade que você deseja frear");
                    controledevelocidade.Frear(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        }while(op != 3);

    }
}
