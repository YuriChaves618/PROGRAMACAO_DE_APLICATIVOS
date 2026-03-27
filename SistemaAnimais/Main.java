package Encapsulamento.Sistema.Animais;
import Encapsulamento.Sistema.Animais.Gato;
import Encapsulamento.Sistema.Animais.Cachorro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Cachorro cachorro = new Cachorro(15);
        Gato gato = new Gato();

       cachorro.emitirSom();
       gato.emitirSom();
    }
}
