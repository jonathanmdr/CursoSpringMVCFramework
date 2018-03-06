package br.com.iniciando.dominio;

/**
 *
 * @author jonat_000
 */
public class Cadastro {
    
    private int id;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }        

    @Override
    public String toString() {
        return "Cadastro{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    
}
