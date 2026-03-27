package Encapsulamento.Sistema.Veiculos;
import Encapsulamento.Sistema.Veiculos.Veiculo;
import Encapsulamento.Sistema.Veiculos.Moto;
import Encapsulamento.Sistema.Veiculos.Carro;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int op = 0;
        Carro carro = new Carro();
        Moto moto = new Moto();

        do {
            System.out.println("\nSistema de Veículo");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Sair");
            System.out.println("Informe a opção desejada");
            op = scanner.nextInt();

            switch(op) {
                case 1:
                    System.out.println("\nVocê está com a chave do seu veículo ?");
                    System.out.println("1. Sim");
                    System.out.println("2. Não");
                    moto.ligar(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("\nVocê está com a chave do seu veículo ?");
                    System.out.println("1. Sim");
                    System.out.println("2. Não");
                    carro.ligar(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("\nEncerrando...");
            }

        }while(op != 3);
    }

}
