public class Alimento extends Produtos {
    private String dataValidade;

    public Alimento(){

    }

    public Alimento(String nome, double preco, String dataValidade){
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade(){
        return this.dataValidade;
    }

    public void setDataValidade( String dataValidade){
        this.dataValidade = dataValidade;
    }

    @Override
    public void mostrarProduto(){
        System.out.println("Nome: "+getNome()+" Preço: "+getPreco()+" Data de Validade: "+getDataValidade());
    }
}
