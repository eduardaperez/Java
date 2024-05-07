package Model;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Livro buscarLivro(int id) {
        for (Livro livro : livros) {
            if(livro.getIdLivro() == id) {
                return livro;
            } else System.out.println("Livro não encontrado");
        }
        return null;
    }

    public Usuario buscarUsuario(int cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf() == cpf) {
                return usuario;
            } else System.out.println("Usuário não encontrado");
        }
        return null;
    }



    

    
    
}
