package br.com.iniciando.conexao;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author jonat_000
 */
public class Conexao {
    
    private Connection conn;
    
    
    private void conectar() {
        System.out.println("Conectando ao banco de dados...");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "masterkey");
        } catch(ClassNotFoundException ex) {
            System.out.println("Driver de conexão não localizado...");
            Logger.getLogger(Conexao.class.getName(), Conexao.class).log(Level.SEVERE, null, ex);
        } catch(SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public Connection getConexao() {
        conectar();
        return conn;
    }
    
}
