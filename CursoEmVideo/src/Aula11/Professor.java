package Aula11;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    

    public Professor(String nome, String sexo, int idade, String especialidade, float salario) {
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumen(float valor) {
        this.setSalario(this.getSalario() + valor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [especialidade=" + especialidade + ", salario=" + salario + "]";
    }

}
