#Arrays com Valores Numericos

import java.util.Scanner;
class Atividade_2 {
// Faça um algoritmo que leia três valores numéricos guardando em  um vetor 
// e armazene a soma em outra variável, 
// se não for um valor numérico peça para digitar novamente. 
// Escreva o valor da soma e quantas vezes foi pedido para digitar os valores.
    public static void main(String args []) {
        int [] vetor = new int[3];
        Scanner sc = new Scanner(System.in);
        int soma=0;
        int i=0;
        int soma_pedidos=0;
        while(i<3){
            int valor=0;
            soma_pedidos+=1;

            System.out.println("Digite o valor "+i);
            try{
                valor = sc.nextInt();
                vetor[i] = valor;
                soma+=vetor[i];
            }catch( Exception e){
                System.out.println("Digite novamente o valor");
                sc.nextLine();
                continue;
            }
            i++;
            
        }

        System.out.println("A soma dos valores é: "+soma);
        System.out.println("O número de vezes que foi pedido para digitar os valores é: "+soma_pedidos);
        for(int elemento:vetor){
            System.out.print(elemento+" ");
        }
       

    }

}
