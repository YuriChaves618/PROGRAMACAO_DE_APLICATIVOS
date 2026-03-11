package SistemaDeNotas;

import TreinoExercicios.CalcularMedia;

public class Aluno {

    private String nome = "";
    private double[] notas = new double[3];

    public Aluno(){

    }

    public Aluno(String nome,double [] notas){
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public double CalcularMedia() {

        double media = 0;

        media = (notas[0] + notas[1] + notas[2]) / 3;

        return media;
    }

    public void ExibirMedia(){

        double media = CalcularMedia();

        System.out.println("--- Informações do Aluno ---");
        System.out.println("Nome: "+getNome());
        System.out.println("Av1: "+notas[0]);
        System.out.println("Av2: "+notas[1]);
        System.out.println("Av3: "+notas[2]);
        System.out.println("Média: "+media);

        if(media >= 7){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }
}
