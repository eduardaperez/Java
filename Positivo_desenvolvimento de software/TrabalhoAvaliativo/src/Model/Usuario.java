package Model;

import java.util.List;

public class Usuario {
    private String nome, telefone, dataNasc, endereco, email;
    private int cpf;
    private List<Livro> livrosEmprestados;
    
    public Usuario(String nome, int cpf, String telefone, String dataNasc, String endereco, String email, int idUsuario) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.email = email;
        this.cpf = cpf;
    }

    public void emprestouLivro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(Livro livro) {
        livrosEmprestados.add(livro);
    }

    
    
}