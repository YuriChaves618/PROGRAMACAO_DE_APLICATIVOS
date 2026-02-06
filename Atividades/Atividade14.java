package AtividadeNivel_06;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        double altura = 0;
        String nome = "";

        System.out.println("Informe seu nome ");
        nome = scanner.next();
        System.out.println("Informe sua idade");
        idade = scanner.nextInt();
        System.out.println("Informe sua altura");
        altura = scanner.nextDouble();

        System.out.println("Nome: "+nome+"|Altura: "+altura+"|Idade: "+idade);

    }
}
