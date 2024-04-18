package Aula9;

import javax.sound.midi.Soundbank;

public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    //construtor
    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("----- DETALHES -----");
        System.out.println("Livro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Página Atual: " + this.getPagAtual());
        System.out.println("Faltam: " + (this.getTotPag() - this.getPagAtual()) + " páginas");
        System.out.println("Leitor: " + this.getLeitor());
    }

    //metodos abstratos
    @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("Livro aberto");
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("Livro fechado");
    }

    @Override
    public void folhear(int pag) {
        if (pag > 0 && pag <= this.totPag) {
            this.aberto = true;
            this.pagAtual = pag;
        } else System.out.println("Página não existente");
    }

    @Override
    public void avancarPag() {
        if (aberto && getPagAtual() < getTotPag()) {
            this.setPagAtual(getPagAtual() + 1);
            System.out.println("Página virada");
        } else if (!aberto && getPagAtual() < getTotPag()) {
            System.out.println("Precisa abrir livro");
        } else {
            this.setPagAtual(1);
        }
    }

    @Override
    public void voltarPag() {
        if (aberto && getPagAtual() > 1) {
            this.setPagAtual(getPagAtual() - 1);
            System.out.println("Página virada");
        } else if (!aberto && getPagAtual() > 1) {
            System.out.println("Precisa abrir livro");
        } else {
            this.setPagAtual(1);
        }
    }

    //metodos especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
}
