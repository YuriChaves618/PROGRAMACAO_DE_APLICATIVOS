
package jogovelha;
import javax.swing.JOptionPane;

public class GameVelha extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GameVelha.class.getName());
    
    String simb = "O";
    String[] caminhosVitorias = new String[9]; // Declara o vetor com 9 posições
    int numeroJogadas = 0, jogador1 = 0, jogador2 = 0, empate = 0;
    String nome1 = "", nome2 = "";
    boolean encontrar = false;
    
    public GameVelha() {
        initComponents();
    }
    
    public void inicializar(){
        for(int i = 0; i < 9; i++){
            caminhosVitorias[i] = "";
        }
        
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        encontrar = false;
        estatistica();
        numeroJogadas = 0;
        
        //Função para iniciar o jogo e resetar o valor de todos os botões, deixando 
    }
    
    public void nomear(){
        nome1 = JOptionPane.showInputDialog(null,"Digite o primeiro nome","Jogador 1",1);
        nome2 = JOptionPane.showInputDialog(null,"Digite o segundo nome","Jogador 2",1);
        idNome.setText(nome1);
        estatistica();
    }
    
    public void estatistica(){
        
        estatistica1.setText(nome1 + " = "+jogador1);
        estatistica2.setText(nome2 +" = "+jogador2);
        estatistica3.setText("Empate = "+empate);
    }
    
    public String simbolo(){
        if(simb.equals("O")){
            simb = "X";
            idNome.setText(nome2);
        }else{
            simb = "O";
            idNome.setText(nome1);
        }
        
        numeroJogadas++;
        return simb;
    }
    
    public void resultado(){
        int id = 1;
        while((id < 9) && ( encontrar == false)){
           if(caminhosVitorias[id].length() == 3){
               if(caminhosVitorias[id].equals("XXX")){
                JOptionPane.showMessageDialog(null,nome1 +", você ganhou!!"," Resultado: ",1);
                jogador1++;
                encontrar= true;
                inicializar();
            }else if((caminhosVitorias[id].equals("OOO"))){
                JOptionPane.showMessageDialog(null,nome2 +", você ganhou!!","Resultado: ",1);
                jogador2++;
                encontrar = true;
                inicializar();
                }
            }
           id++;
        }
        
        if((numeroJogadas == 9)&&(encontrar == false)){
            JOptionPane.showMessageDialog(null,"Jogo Empatado ","Resultado",1);
            empate++;
            inicializar();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        identificador = new javax.swing.JLabel();
        idNome = new javax.swing.JLabel();
        estatistica = new javax.swing.JLabel();
        estatistica1 = new javax.swing.JLabel();
        estatistica2 = new javax.swing.JLabel();
        estatistica3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b1.addActionListener(this::b1ActionPerformed);
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 90, 73));

        b2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b2.addActionListener(this::b2ActionPerformed);
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 90, 73));

        b3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b3.addActionListener(this::b3ActionPerformed);
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 90, 73));

        b4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b4.addActionListener(this::b4ActionPerformed);
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 90, 73));

        b5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b5.addActionListener(this::b5ActionPerformed);
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 90, 73));

        b6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b6.addActionListener(this::b6ActionPerformed);
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 90, 73));

        b7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b7.addActionListener(this::b7ActionPerformed);
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 90, 73));

        b8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b8.addActionListener(this::b8ActionPerformed);
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 90, 73));

        b9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b9.addActionListener(this::b9ActionPerformed);
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 90, 73));

        identificador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        identificador.setText("Vez do Jogador : ");
        getContentPane().add(identificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        idNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idNome.setForeground(new java.awt.Color(255, 51, 51));
        idNome.setText("Vez do Jogador : ");
        getContentPane().add(idNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 30));

        estatistica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica.setText("Estatística ");
        getContentPane().add(estatistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, 30));

        estatistica1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica1.setText("Estatística ");
        getContentPane().add(estatistica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, 30));

        estatistica2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica2.setText("Estatística ");
        getContentPane().add(estatistica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, 30));

        estatistica3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica3.setText("Estatística ");
        getContentPane().add(estatistica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, 30));

        pack();
    }// </editor-fold>                        

        
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   

        if (b3.getText().equals("")){
            b3.setText(simbolo());
            caminhosVitorias[1] +=b3.getText();
            caminhosVitorias[6] +=b3.getText();
            caminhosVitorias[8] +=b3.getText();
            
        }
    
        if(numeroJogadas>= 5)resultado();       
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        
        if(b6.getText().equals("")){
            b6.setText(simbolo());
            caminhosVitorias[2] +=b6.getText();
            caminhosVitorias[6] +=b6.getText();
        }
         if(numeroJogadas >= 5)resultado();
    }                                  

     
    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        
        if(b9.getText().equals("")){
            b9.setText(simbolo());
            caminhosVitorias[3] +=b9.getText();
            caminhosVitorias[6] +=b9.getText();
            caminhosVitorias[7] +=b9.getText();
                    
        }
        if(numeroJogadas >= 5)resultado();
    }                                  
       
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
         if (b2.getText().equals("")){
            b2.setText(simbolo());
            caminhosVitorias[1] +=b2.getText();
            caminhosVitorias[5] +=b2.getText();
      
        }
    
        if(numeroJogadas>= 5)resultado(); 
    }                                  

    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if (b1.getText().equals("")){
            b1.setText(simbolo());
            caminhosVitorias[1] +=b1.getText();
            caminhosVitorias[4] +=b1.getText();
            caminhosVitorias[7] +=b1.getText();
            
        }
        
        if(numeroJogadas>= 5)resultado();
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
         if(b5.getText().equals("")){
            b5.setText(simbolo());
            caminhosVitorias[2] +=b5.getText();
            caminhosVitorias[5] +=b5.getText();
            caminhosVitorias[7] +=b5.getText();
            caminhosVitorias[8] +=b5.getText();
        }
        
        if(numeroJogadas>= 5) resultado();
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
         if(b4.getText().equals("")){
            if(b4.getText().equals("")){
                b4.setText(simbolo());
                caminhosVitorias[2] +=b4.getText();
                caminhosVitorias[4] +=b4.getText();
                
            }
            
            if(numeroJogadas >= 5) resultado();
        }
    }                                  

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
         if(b7.getText().equals("")){
            b7.setText(simbolo());
            caminhosVitorias[3] +=b7.getText();
            caminhosVitorias[4] +=b7.getText();
            caminhosVitorias[8] +=b7.getText();
        }
         if(numeroJogadas >= 5)resultado();
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(b8.getText().equals("")){
            b8.setText(simbolo());
            caminhosVitorias[3] +=b8.getText();
            caminhosVitorias[5] +=b8.getText();
         
        }
        
        if(numeroJogadas >= 5)resultado();
    }                                  

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
        nomear();
        inicializar();
        
    }                                 


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new GameVelha().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel estatistica;
    private javax.swing.JLabel estatistica1;
    private javax.swing.JLabel estatistica2;
    private javax.swing.JLabel estatistica3;
    private javax.swing.JLabel idNome;
    private javax.swing.JLabel identificador;
    // End of variables declaration                   
}
