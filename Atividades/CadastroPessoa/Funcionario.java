package CadastroPessoas;

public class Funcionario extends Pessoa{

    private String cargo = "";

    public Funcionario(){

    }

    public Funcionario(String cargo, String nome, int idade){
        super(nome , idade);
        this.cargo = cargo;
    }

    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String cargo){
        this.cargo =  cargo;
    }

    @Override
    public void exibirDados(){
        System.out.println("\nNome: "+getNome()+" Idade: "+getIdade()+" Cargo: "+getCargo());
    }
}
