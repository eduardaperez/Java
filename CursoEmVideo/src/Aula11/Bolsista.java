package Aula11;

public final class Bolsista extends Aluno {//não pode ser criada outra classe filha - folha

    private float bolsa;

    public Bolsista(String nome, String sexo, int idade, int matricula, String curso, float bolsa) {
        super(nome, sexo, idade, matricula, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("bolsa renovada de " + this.getNome());
    }

    @Override
    public void pagarMensal() {
        System.out.println(this.nome + " é bolsista. Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista [bolsa=" + bolsa + ", nome=" + nome + ", curso=" + curso + ", sexo=" + sexo
                + ", getMatricula()=" + getMatricula() + ", getIdade()=" + getIdade() + "]";
    }

    
    
}
