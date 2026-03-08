package Banco;

import java.sql.SQLOutput;

public class ContaBancaria {

    private String numeroConta = "";
    private String titular = "";
    private double saldo = 0;

    public ContaBancaria(){

    }

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(){
        this.saldo = saldo;
    }

    public void Deposito(double valor_saldo){

        if(valor_saldo < 0){
            System.out.println("Impossível realizar um deposito negativo!");
            return;
        }else{
            this.saldo = valor_saldo;
            System.out.println("Depósito Realizado com Sucesso");
        }
    }

    public void Sacar(double valor_saque){

        int divisao = 0;
        int notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0;
        int notas2 = 0, notas1 = 0;

        if( valor_saque > this.saldo){
            System.out.println("Saldo insuficiente");
            return;
        }

        if(valor_saque >= 100){
            divisao = (int)valor_saque / 100;
            valor_saque = valor_saque - (divisao * 100);
            notas100 = divisao;
        }

        if(valor_saque >= 50 && valor_saque < 100){
            divisao = (int)valor_saque / 50;
            valor_saque = valor_saque - (divisao * 50);
            notas50 = divisao;
        }

        if(valor_saque >= 20 && valor_saque < 50){
            divisao = (int)valor_saque / 20;
            valor_saque = valor_saque - (divisao * 20);
            notas20 = divisao;
        }

        if(valor_saque >= 10 && valor_saque < 20){
            divisao = (int)valor_saque / 10;
            valor_saque = valor_saque - (divisao * 10);
            notas10 = divisao;
        }

        if(valor_saque >= 5 && valor_saque < 10){
            divisao = (int)valor_saque / 5;
            valor_saque = valor_saque - (divisao * 5);
            notas5 = divisao;
        }

        if(valor_saque >= 2 && valor_saque < 5){
            divisao = (int)valor_saque / 2;
            valor_saque = valor_saque - (divisao * 2);
            notas2 = divisao;
        }

        if(valor_saque >= 1 && valor_saque < 2){
            divisao = (int)valor_saque / 1;
            valor_saque = valor_saque - (divisao * 1);
            notas1 = divisao;
        }

        System.out.println("Saque Realizado com Sucesso, Você receberá: ");
        System.out.println(notas100+" Notas de 100");
        System.out.println(notas50+ " Notas de 50");
        System.out.println(notas20+ " Notas de 20");
        System.out.println(notas10+ " Notas de 10");
        System.out.println(notas5+  " Notas de 5");
        System.out.println(notas2+  " Notas de 2");
        System.out.println(notas1+  " Notas de 1");
    }

    public void ValidaNumeroConta(String Numero_Conta){
        if(this.numeroConta == Numero_Conta){
            System.out.println("Credencial Correta!");
        }else{
            System.out.println("Credencial Incorreta!");
        }
    }

    public void ValidaNome(String Nome){
        if(this.titular == Nome){
            System.out.println("Credencial Correta!");
        }else{
            System.out.println("Credencial Incorreta!");
        }
    }
}
