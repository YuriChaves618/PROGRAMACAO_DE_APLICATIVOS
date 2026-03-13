package CadastroPessoas;

public class Cliente extends Pessoa{

    private String email =  "";

    public Cliente(){

    }

    public Cliente(String nome, int idade, String email){
        super(nome, idade);
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public void exibirDados(){
        System.out.println("\nNome: "+getNome()+" Idade: "+getIdade()+" Email: "+getEmail());
    }
}
