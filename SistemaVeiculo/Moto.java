package Encapsulamento.Sistema.Veiculos;

public class Moto extends Veiculo{

    public Moto(){

    }

    @Override
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
