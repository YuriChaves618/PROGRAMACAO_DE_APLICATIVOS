package projetofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    
    private static final String URL = "jdbc:mysql://localhost:3306/projeto_final?useTimezone=true&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "lemonboiandme4141$";
    
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch(ClassCastException e) {
            System.err.println(e.getMessage());
            return null;
        } catch(SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    public static void main(String[] args) {
        Connection conexao = ConexaoBanco.conectar();
        if(conexao != null) {
            System.out.println("Conexão realizada com sucesso.");
            try {
                conexao.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

