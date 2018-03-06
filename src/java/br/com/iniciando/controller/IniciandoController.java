package br.com.iniciando.controller;

import br.com.iniciando.dao.CadastroDAO;
import br.com.iniciando.dominio.Cadastro;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jonat_000
 */
@Controller
public class IniciandoController {
    
    @RequestMapping("/olaMundo")
    public String iniciando(Model model, Cadastro cadastro) {
        CadastroDAO dao = new CadastroDAO();
        
        try {
            dao.gravar(cadastro);
            
            model.addAttribute("nome", cadastro.getNome());
        } catch(SQLException ex) {
            System.out.println(ex);
        }
        
        return "index";
    }
    
    @RequestMapping("/lista")
    public String exibir(Model model) {
        CadastroDAO dao = new CadastroDAO();
        
        try {
            model.addAttribute("lista", dao.pesquisar());
        } catch(SQLException ex) {
            System.out.println(ex);
        }
        
        return "exibir";
    }
    
    @RequestMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }
    
    @RequestMapping("/")
    public String inicio() {
        return "inicio";
    }
    
}
