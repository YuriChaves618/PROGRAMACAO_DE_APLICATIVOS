import javax.swing.*;

//o * importa toda a biblioteca swing

public class Tabuada1 { //Classe que armazenará a função main
    
    public static void main(String[]args){ 
        
        Operacao op = new Operacao();
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"," Número",1));
        String simb = JOptionPane.showInputDialog(null, "1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n\n"," Símbolo ",1);
        
        for(int i = 0; i < 10; i++){
            switch(simb){
                case "1" -> op.adicao(num,i);
                case "2" -> op.subtracao(num, i);
                case "3" -> op.multiplicacao(num, i);
                case "4" -> op.divisao(num, i);
                
            }
        }
        
        op.imprimir();
    }
    
}
