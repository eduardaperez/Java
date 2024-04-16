import java.util.List;

public class Departamento {

    private List<Funcionario> funcionarios;
    private String nome;

    

    public Departamento(List<Funcionario> funcionarios, String nome) {
        this.funcionarios = funcionarios;
        this.nome = nome;
    }

    public Funcionario buscarFuncCpf(int cpf) {
        return funcionarios.stream().filter(e -> e.getCpf() == cpf).findFirst().orElse(null); //e de elemento - boas práticas
    }

    public Funcionario buscarFuncNome(String nome) {
        return funcionarios.stream().filter(e -> e.getNome().equals(nome)).findFirst().orElse(null);
    }

    public void addFuncionario(Funcionario funcionario) {
        if (buscarFuncCpf(funcionario.getCpf()) == null) {
            funcionario.add(funcionario);
        }
    }

    public void remFuncionario(Funcionario funcionario) {
        funcionarios.remove(buscarFuncCpf(cpf));
    }



    
    //g/s
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Departamento [funcionarios=" + funcionarios + ", nome=" + nome + ", getFuncionarios()="
                + getFuncionarios() + ", getNome()=" + getNome() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }
    
    
}
