import Exercicio01.Pagamento;

import java.util.Scanner;

public class CartaoCredito implements Pagamento {

    Scanner scanner = new Scanner(System.in);
    private long numero = 0;
    private String senha = "";
    private String cvc = "";
    private int parcelamento = 0;

    public CartaoCredito() {

    }

    public CartaoCredito( long numero, String senha, String cvc, int parcelamento){

        this.numero = numero;
        this.senha = senha;
        this.cvc = cvc;
        this.parcelamento = parcelamento;

    }

    public long getNumero(){
        return this.numero;
    }

    public void setPagamento(long numero){
        this.numero = numero;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getCvc(){
        return this.cvc;
    }

    public void setCvc(String cvc){
        this.cvc = cvc;
    }

    public int getParcelamento(){
        return this.parcelamento;
    }

    public void setParcelamento(int parcelamento){
        this.parcelamento = parcelamento;
    }

    public void pagar(double valor){
        System.out.println("\nCartão: R$"+valor);
    }

    public void cadastrarCartao(){

        System.out.println("Informe o número do cartão ");
        this.numero = scanner.nextLong();
        System.out.println("Informe a senha do cartão ");
        this.senha = scanner.next();
        System.out.println("Informe o código de segurança do cartão");
        this.cvc = scanner.next();
        System.out.println("Informe quantas vezes serão parceladas a compra");
        this.parcelamento = scanner.nextInt();

        System.out.println("Cadastro realizado com Sucesso!");
    }

}
