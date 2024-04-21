package Aula11;

public class Aluno extends Pessoa {
    private int matricula;
    protected String curso;
    

    public Aluno(String nome, String sexo, int idade, int matricula, String curso) {
        super(nome, sexo, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void pagarMensal() {
        System.out.println("Mensalidade paga");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", curso=" + curso + ", sexo=" + sexo
                + ", getIdade()=" + getIdade() + "]";
    }

    

    
    

    
}
