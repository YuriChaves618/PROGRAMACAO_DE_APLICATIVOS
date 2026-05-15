
package atividadeTabuada;

import javax.swing.JOptionPane; 
/*
Importação da biblioteca JOptionPane para utilizar suas funções
*/

public class Operacao {//Classe que armazenará as operações
    
    String res = "";
    
    public void adicao(int n, int x){/* Metodo que exibirá a tabuada completa da adição de forma organizada, 
        de modo que transformará os inteiros em String e o resultado das operações em String também, pois o String armazena até 256 caracteres, conseguindo
        exibir a tabuada completa.
        */
        res+= String.valueOf(n)+" + "+String.valueOf(x)+" = "+String.valueOf(n+x)+"\n";
        
    }
    
    public void subtracao(int n, int x){
        /* Metodo que exibirá a tabuada completa da subtração de forma organizada, 
        de modo que transformará os inteiros em String e o resultado das operações em String também, pois o String armazena até 256 caracteres, conseguindo
        exibir a tabuada completa.
        */
        
        /*
        A lógica da subtração difere da adição pois chegamos na sutração fazendo o inverso da adição, para então chegar a um resultado.
        */
        res+= String.valueOf(n+x)+" - "+String.valueOf(n)+" = "+String.valueOf(x)+"\n";
    }
    
    public void multiplicacao(int n, int x){
         /* Metodo que exibirá a tabuada completa da multiplicacao de forma organizada, 
        de modo que transformará os inteiros em String e o resultado das operações em String também, pois o String armazena até 256 caracteres, conseguindo
        exibir a tabuada completa.
        */
        res+= String.valueOf(n)+" x "+String.valueOf(x)+" = "+String.valueOf(n*x)+"\n";
    }
    
    public void divisao(int n, int x){
         /* Metodo que exibirá a tabuada completa da subtração de forma organizada, 
        de modo que transformará os inteiros em String e o resultado das operações em String também, pois o String armazena até 256 caracteres, conseguindo
        exibir a tabuada completa.
        */
        
        /*
        A lógica da divisao acontece de forma parecida da subtração pois chegamos na divisão fazendo o inverso da multiplicação, para então chegar a um resultado
        */
        res+= String.valueOf(n*x)+ " ÷ "+String.valueOf(n)+" = "+String.valueOf(x)+"\n";
    }
    
    public void imprimir(){
        /*
        Metodo que exibirá o resultado das operações por meio da variável res, utilizando a função ShowMessageDialog da biblioteca, JOption Pane
        que segue a seguinte estrutura, (retorno, o que será exibido, Titulo, numero referente a um determinado simbolo)
        */
        JOptionPane.showMessageDialog(null, res, "Tabuada",0);
    }
    
}
