package CadastroPessoas;

public class Pessoa {
    private String nome = "";
    private int idade = 0;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println("Nome: "+getNome()+"Idade: "+getIdade());
    }

}
