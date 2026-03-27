package Encapsulamento.Sistema.Animais;

public class Animal {

    private String nome = "";

    public Animal(){

    }

    public Animal(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("O animal emite determinado som");
    }

}
