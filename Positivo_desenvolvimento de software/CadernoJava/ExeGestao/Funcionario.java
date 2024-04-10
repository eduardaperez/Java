package ExeGestao;

public class Funcionario {
    private String nome, cargo;
    private int cpf;
    private int idade;


    //Construtor
    public Funcionario(String nome, String cargo, int cpf, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.idade = idade;
    }

    //Getter/Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
