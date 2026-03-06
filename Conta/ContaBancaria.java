package ContaBancaria;
import java.util.Scanner;

public class Conta_Bancaria {

    Scanner scanner = new Scanner(System.in);

    private String numero_conta = "";
    private String titular = "";
    private double saldo = 0;

    public Conta_Bancaria(){

    }

    public Conta_Bancaria(String numero_conta, String titular, double saldo){
        this.numero_conta = numero_conta;
        this.titular = titular;
        this.saldo = saldo;

    }

    public String getNumero_Conta(){
        return this.numero_conta;
    }

    public void setNumero_Conta(String numero_conta){
        this.numero_conta = numero_conta;
    }

    public String getTitulart(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void Deposito(){

        int valorDeposito = 0;
        System.out.println("Informe o valor que deseja depositar");
        setSaldo(scanner.nextDouble());

    }

    public void Sacar(){
        int divisao = 0, valorsaque = 0;
        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0,nota2 = 0, nota1 = 0;

            System.out.println("Qual valor você deseja sacar ?");
            valorsaque = scanner.nextInt();


            if(valorsaque > getSaldo()){
                System.out.println("Saldo Indisponível");
            }

                if (valorsaque >= 100) {
                    divisao = valorsaque / 100;
                    nota100 = divisao;
                    valorsaque = valorsaque - (divisao * 100);
                }

                if(valorsaque >= 50 && valorsaque < 100){
                    divisao = valorsaque / 50;
                    nota50 = divisao;
                    valorsaque = valorsaque - (divisao * 50);
                }

                if(valorsaque >= 20 && valorsaque < 50){
                    divisao = valorsaque / 20;
                    nota20 = divisao;
                    valorsaque = valorsaque - (divisao * 20);
                }

                if(valorsaque >= 10 && valorsaque < 20){
                    divisao = valorsaque / 10;
                    nota10 = divisao;
                    valorsaque = valorsaque - (divisao * 10);

                }
                if(valorsaque >= 5 && valorsaque < 10){
                    divisao = valorsaque/5;
                    nota5 = divisao;
                    valorsaque = valorsaque - (divisao * 5);
                }
                if(valorsaque >= 2 && valorsaque < 5){
                    divisao = valorsaque/2;
                    nota2 = divisao;
                    valorsaque = valorsaque - (divisao * 2);
                }
                if(valorsaque >= 1 && valorsaque < 2){
                    divisao = valorsaque/1;
                    nota1 = divisao;
                    valorsaque = valorsaque - (divisao * 1);
                }

                System.out.println("Você vai receber "+nota100+" notas de 100| "+nota50+" notas de 50 | "+nota20+" notas de 20 | "+nota10+" notas de 10 | "+nota5+" notas de 5| "
                +nota2+" notas de 2 e "+nota1+" notas de 1");

            }

               }
