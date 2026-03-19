public class Produtos {
    private String nome;
    private double preco;

    public Produtos(){

    }

    public Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void mostrarProduto(){
        System.out.println("Nome: "+getNome()+" Preço: "+getPreco());
    }
}
