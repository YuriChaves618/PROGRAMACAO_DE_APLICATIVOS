package Encapsulamento.Sistema.Veiculos;
import java.util.Scanner;

public class Veiculo {

    Scanner scanner = new Scanner(System.in);

    private String marca = "";

    public Veiculo() {

    }

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return this.marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public void ligar(int op1){

        Boolean chavePresencial = true;

        if(op1 == 1){
            chavePresencial = true;
        }

        if(op1 == 2){
            chavePresencial = false;
        }

        if(chavePresencial == true){
            System.out.println("Veículo ligando...");
        }else{
            System.out.println("Impossível ligar o veículo sem a chave");
        }


    }
}
