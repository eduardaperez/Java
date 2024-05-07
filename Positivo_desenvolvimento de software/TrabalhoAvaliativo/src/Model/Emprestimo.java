package Model;

import java.time.LocalDate;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo, dataDevolucaoPrevista, dataDevolucaoReal;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = null;
        this.dataDevolucaoPrevista = null;
        this.dataDevolucaoReal = null;
    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
        if (livro.getNumExemplares() > 1 && this.usuario.equals(usuario)) {
            livro.setNumExemplares(livro.getNumExemplares() - 1);
            this.dataEmprestimo = LocalDate.now();
            this.dataDevolucaoPrevista = this.dataEmprestimo.plusDays(7);
            this.usuario.setLivrosEmprestados(livro);

            System.out.println("Emprestimo realizado para " + this.usuario.getNome() + " com devolução prevista para " + this.dataDevolucaoPrevista);
        } else System.out.println("Não foi possível realizar o empréstimo");
    }

    public void devolverLivro(Livro livro, Usuario usuario) {
        if (this.usuario.getLivrosEmprestados() == livro) {
            livro.setNumExemplares(livro.getNumExemplares() + 1);
            this.dataDevolucaoReal = LocalDate.now();

            System.out.println("Devolução realizada com sucesso");
        } else System.out.println("Não foi possível a devolução, verifique as informações");
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(LocalDate dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    
}
