package Aula10;

public class Aluno extends Pessoa { //Classe filha/subClasse
    private int matricula;
    private String curso;

    public void cancelarMatr() {
        System.out.println("Aguarde até 5 dias úteis para a revisão da solicitação");
    }

    //metodos especiais
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

    
}
