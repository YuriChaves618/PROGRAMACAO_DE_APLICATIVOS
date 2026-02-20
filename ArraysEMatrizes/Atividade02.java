package Atividade02_Arrays;
import java.util.Scanner;

/*
2.Ler 4 números inteiros (usando vetor) e calcular a soma dos que forem par, trate os
possíveis erros.
*/
public class Atividade02_02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[4];
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            int valores = 0, divisao = 0;
            System.out.println("Digite o "+(i+1)+" Número");
            valores = scanner.nextInt();

            try{
                numeros[i] = valores;
                divisao = valores % 2;

                if( divisao == 0 ){
                    soma += numeros[i];
                }
            }catch(Exception e){
                System.out.println("Valor Inválido! Tente Novamente");
                scanner.nextLine();
                continue;
            }

        }

            System.out.println("A soma dos números pares digitados é: "+soma);


    }
}
