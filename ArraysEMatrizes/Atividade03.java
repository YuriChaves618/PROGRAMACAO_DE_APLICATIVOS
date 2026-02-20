package Atividade02_Arrays;
import java.util.Scanner;

/*
3.Faça um algoritmo que leia 2 valores numéricos e um símbolo. Caso o símbolo seja um dos
relacionados abaixo efetue a operação correspondente com os valores.
a. “+” operação de soma
b. “-” operação de subtração
c. “*” operação de multiplicação
d. “/” operação de divisão
e. “**” exponencial

seodenominadorforzero,informaraousuárioqueadivisãonãopodeserfeita.Seosímbolofordiferentedesse
citadosacima,escreva“Impossível realizaraoperação”.Parasairdoprogramadeveserdigitadoapalavra“EXIT”.*/

public class Atividade02_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = 0, n2 = 0;
        int op = 0;
        char simbolo;
        String sair = null;

        System.out.println("Informe um número");
        n1 = scanner.nextDouble();
        System.out.println("Informe mais um número");
        n2 = scanner.nextDouble();

        do {

            System.out.println("--- Menu Principal ---");
            System.out.println("1. Realizar Operações");
            System.out.println("2. Sair do Programa");
            op = scanner.nextInt();

            switch(op){
                case 1:

                System.out.println("Informe a operação desejada");
                System.out.println("+ (Soma)");
                System.out.println("- (Subtração)");
                System.out.println("* (Multiplicação)");
                System.out.println("/ (Divisão)");
                System.out.println("x (Exponencial)");
                simbolo = scanner.next().charAt(0);

                switch (simbolo) {
                    case '+':
                        double soma = n1 + n2;
                        System.out.println("A soma dos números é: " + soma);
                        break;
                    case '-':
                        double subtracao = n1 - n2;
                        System.out.println("A subtração dos números é: " + subtracao);
                        break;
                    case '*':
                        double multiplicacao = n1 * n2;
                        System.out.println("A multiplicação dos números é: " + multiplicacao);
                        break;
                    case '/':
                        double divisao = n1 / n2;
                        if (n2 == 0) {
                            System.out.println("Divisão Inválida, pois o denominador é 0");
                            break;
                        } else {
                            System.out.println("A divisão dos números é: " + divisao);
                            break;
                        }
                    case 'x':
                        double Exponencial1 = Math.pow(n1, 2);
                        double Exponencial2 = Math.pow(n2, 2);
                        System.out.println("O primeiro número ao quadrado é:  "+ Exponencial1);
                        System.out.println("O segundo número ao quadrado é: "+Exponencial2);
                        break;
                    default:
                        int opex = 0;

                        while(opex != 2) {
                            System.out.println("Impossível Realizar a Operação");
                            System.out.println("Para sair do Programa digite a palavra: 'EXIT' e Digite 2 quando retornar ao Menu Principal!");
                            sair = scanner.next();
                            if (sair.toLowerCase().contains("exit")) {
                                opex = 2;
                                break;
                            } else {
                                System.out.println("Tente Novamente");
                                opex = 1;
                            }
                            break;
                        }
                    case 2:
                        break;
                }
            }

        }while(op != 2);
    }
}
