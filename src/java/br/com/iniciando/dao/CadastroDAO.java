package br.com.iniciando.dao;

import br.com.iniciando.conexao.Conexao;
import br.com.iniciando.dominio.Cadastro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jonat_000
 */
public class CadastroDAO {
    
    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("IniciandoComSpringMVCPU");
        return factory.createEntityManager();
    }
    
    public void gravar(Cadastro cadastro) throws SQLException {
//        Conexao conn = new Conexao();
//        
//        String sql = "insert into cadastro(nome, endereco, telefone, email) values(?,?,?,?)";
//        
//        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
//        
//        ps.setString(1, cadastro.getNome());
//        ps.setString(2, cadastro.getEndereco());
//        ps.setInt(3, cadastro.getTelefone());
//        ps.setString(4, cadastro.getEmail());
//        
//        ps.execute();
          
        EntityManager em = getEM();
        em.getTransaction().begin();
        em.persist(cadastro);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Cadastro> pesquisar() throws SQLException {
        List<Cadastro> list = new ArrayList<>();
        
        Conexao conn = new Conexao();
        
        String sql = "select * from cadastro";
        
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Cadastro cad = new Cadastro();
            
            cad.setId(rs.getInt("id"));
            cad.setNome(rs.getString("nome"));
            cad.setEndereco(rs.getString("endereco"));
            cad.setTelefone(rs.getInt("telefone"));
            cad.setEmail(rs.getString("email"));
            System.out.println(cad);
            list.add(cad);
        }
        
        return list;
    }
}
