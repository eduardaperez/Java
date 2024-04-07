import java.time.LocalDate;
import java.time.Period;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    public Autor autor;

    public Livro(String titulo, Autor autor,int anoPublicacao) {
        this.titulo = titulo;
        this.autor =  autor;
        this.anoPublicacao = anoPublicacao;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void exibirInformacoes() {
        LocalDate dataAtual = LocalDate.now();
        int anosDesdePublicacao = Period.between(LocalDate.of(anoPublicacao, 1, 1), dataAtual).getYears();
       System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Anos desde a Publicação: " + anosDesdePublicacao);
    }
}
class Autor {
    public String autor;
    public Autor(String autor){
        this.autor = autor;
    }
}