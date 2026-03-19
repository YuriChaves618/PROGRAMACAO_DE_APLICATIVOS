public class Eletronico extends Produtos {
    private String garantia = "";

    public Eletronico() {

    }

    public Eletronico(String garantia, String nome, double preco) {
        super(nome, preco);
        this.garantia = garantia;
    }

    public String getGarantia() {
        return this.garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public void mostrarProduto(){
        System.out.println("Nome: "+getNome()+" Preço: "+getPreco()+" Garantia"+getGarantia());
    }

    }
