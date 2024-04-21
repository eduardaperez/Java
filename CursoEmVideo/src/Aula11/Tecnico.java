package Aula11;

public class Tecnico extends Aluno {

    private int registroProf;
    private int pratica = 0;

    public Tecnico(String nome, String sexo, int idade, int matricula, String curso, int registroProf, int pratica) {
        super(nome, sexo, idade, matricula, curso);
        this.registroProf = registroProf;
        this.pratica = pratica;
    }

    public void praticar() {
        this.pratica++;
    }



    public int getRegistroProf() {
        return registroProf;
    }



    public void setRegistroProf(int registroProf) {
        this.registroProf = registroProf;
    }



    public int getPratica() {
        return pratica;
    }



    public void setPratica(int pratica) {
        this.pratica = pratica;
    }



    @Override
    public String toString() {
        return "Tecnico [registroProf=" + registroProf + ", pratica=" + pratica + "]";
    }
    
    
}
