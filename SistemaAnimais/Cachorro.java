package Encapsulamento.Sistema.Animais;

public class Cachorro extends Animal{

    private int vezes;

    public Cachorro(){

    }

    public Cachorro(int vezes){
        this.vezes = vezes;
    }

    @Override
    public void emitirSom(){
        System.out.println("O cachorro faz woof - woof: " + this.vezes + " vezes");
    }

}
