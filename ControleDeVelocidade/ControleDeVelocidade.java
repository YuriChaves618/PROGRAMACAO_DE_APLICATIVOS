package ControleVelocidade;

public class ControleDEVelocidade {

    private String marca = "";
    private double velocidade_atual = 0;
    private  double velocidade_maxima = 0;

    public ControleDEVelocidade(){

    }

    public ControleDEVelocidade( String marca, double velocidade_atual, double velocidade_maxima){
        this.marca = marca;
        this.velocidade_atual = velocidade_atual;
        this.velocidade_maxima = velocidade_maxima;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getVelocidade_Atual(){
        return this.velocidade_atual;
    }

    public void setVelocidade_Atual(double velocidade_atual){
        this.velocidade_atual = velocidade_atual;
    }

    public double getVelocidade_Maxima(){
        return this.velocidade_maxima;
    }

    public void setVelocidade_maxima(double velocidade_maxima){
        this.velocidade_maxima = velocidade_maxima;
    }

    public void Aceleracao(double valor_aceleracao) {
        if (valor_aceleracao >= this.velocidade_maxima) {
            System.out.println("Impossível acelerar nesta velocidade!");
            return;
        } else {
            this.velocidade_atual += valor_aceleracao;

            System.out.println("A velocidade atual é: " + this.velocidade_atual);
        }
    }

    public void Frear(double valor_freio){
        if(valor_freio > this.velocidade_atual){
            System.out.println("Impossível frear nesta velocidade");
            return;
        }

        this.velocidade_atual -= valor_freio;
        System.out.println("A velocidade atual é: "+this.velocidade_atual);

    }

}

