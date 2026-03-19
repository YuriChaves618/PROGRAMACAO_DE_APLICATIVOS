public class Carro extends Veiculo{
    private int portas = 0;

    public Carro(){

    }

    public Carro(String marca, int ano, int portas){
        super(marca , ano);
        this.portas = portas;
    }

    public int getPortas(){
        return this.portas;
    }

    public void setPortas(int portas){
        this.portas = portas;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Marca: "+getMarca()+" Ano: "+getAno()+" Portas: "+getPortas());
    }
}
