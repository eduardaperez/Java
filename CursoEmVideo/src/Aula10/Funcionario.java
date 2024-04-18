package Aula10;

public class Funcionario extends Pessoa { //Classe filha/subClasse
    private String setor;
    private boolean trabalhando;

    public void mudaTrabalho() {
        /*if (trabalhando) {
            this.trabalhando = false;
        } else this.trabalhando = true; */
        this.trabalhando = !this.trabalhando;
    }

    //metodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
