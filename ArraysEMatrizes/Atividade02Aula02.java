import java.util.Scanner;

public class Atividade02_04 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int [] [] numeros = new int [3][3];

        System.out.println("\n=== Atividade Matrizes ===\n");

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length;j++){

                System.out.println("Informe um Número");

                try{
                    numeros[i] [j] = scanner.nextInt();
                }catch(Exception e){
                    System.out.println("Valor Inválido!,Tente Novamente");
                    scanner.nextLine();
                    j--;
                    continue;
                }

            }
        }
        System.out.println("\nNúmeros Informados Dentro da Matriz");
        for( int [] linha : numeros){
            for( int valor : linha){
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        System.out.println("\nValores da Diagonal Principal da Matriz");
        System.out.println(numeros[0][0]);
        System.out.println(" "+numeros[1][1]);
        System.out.println(" "+" "+numeros[2][2]);

        System.out.println("\nValores da Diagonal Secundária da Matriz");
        System.out.println(" "+" "+numeros[0][2]);
        System.out.println(" "+numeros[1][1]);
        System.out.println(numeros[2][0]);

        System.out.println("\nValores Acima da Diagonal Principal");
        System.out.println("  "+numeros[0][1]+" "+numeros[0][2]);
        System.out.println("  "+"  "+numeros[1][2]);

        System.out.println("\nValores Abaixo da Diagonal Principal");
        System.out.println(numeros[1][0]);
        System.out.println(numeros[2][0]+" "+numeros[2][1]);

    }
}
