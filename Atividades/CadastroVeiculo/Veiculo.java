public class Moto extends Veiculo{
    private double cilindradas;

    public Moto(){

    }

    public Moto( String marca, int ano, double cilindradas){
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    public double getCilindradas(){
        return this.cilindradas;
    }

    public void setCilindradas(double cilindradas){
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Marca: "+getMarca()+" Ano: "+getAno()+" Cilindradas: "+getCilindradas());
    }
}
