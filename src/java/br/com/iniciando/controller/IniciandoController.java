package br.com.iniciando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jonat_000
 */
@Controller
public class IniciandoController {
    
    @RequestMapping("/olaMundo")
    public String iniciando(Model model, @RequestParam("nome") String nome) {
        model.addAttribute("nome",nome);
        return "index";
    }
    
    @RequestMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }
    
}
