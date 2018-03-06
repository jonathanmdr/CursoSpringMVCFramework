package br.com.iniciando.dao;

import br.com.iniciando.conexao.Conexao;
import br.com.iniciando.dominio.Cadastro;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jonat_000
 */
public class CadastroDAO {
    
    public void gravar(Cadastro cadastro) throws SQLException {
        Conexao conn = new Conexao();
        
        String sql = "insert into cadastro(nome, endereco, telefone, email) values(?,?,?,?)";
        
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        
        ps.setString(1, cadastro.getNome());
        ps.setString(2, cadastro.getEndereco());
        ps.setInt(3, cadastro.getTelefone());
        ps.setString(4, cadastro.getEndereco());
        
        ps.execute();
    }
    
    public static void main(String ... args) {
        Cadastro cad = new Cadastro();
        CadastroDAO dao = new CadastroDAO();
        
        cad.setNome("Jonathan Henrique Medeiros");
        cad.setEndereco("Rua teste");
        cad.setTelefone(1234567890);
        cad.setEmail("jonathan.mdr@hotmail.com");
        
        try {
            dao.gravar(cad);
        } catch(SQLException ex) {
            System.out.println(ex);
        }
    }
}
