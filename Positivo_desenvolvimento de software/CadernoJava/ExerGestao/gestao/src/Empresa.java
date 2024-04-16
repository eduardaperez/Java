import java.util.List;

public class Empresa {
    List <Departamento> departamentos;


    public Empresa(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public Departamento buscarDepartamento(String nome) {
        return departamentos.stream().filter(e -> e.getNome().equals(nome)).findFirst().orElse(null);
    }

    public void addDepartamento(Departamento dep) {
        if (buscarDepartamento(dep.getNome()) == null) {
            departamentos.add(dep);
        }
    }

    public void remDepartamento(Departamento nome) {
        departamentos.remove(buscarDepartamento(nome));
    }

    public Funcionario buscarFuncCpf(int cpf) {
        for (Departamento dep : departamentos) {
            func = dep.buscarFuncNome(cpf);
        }
        return func;
    }

    public Funcionario addFuncionario(Funcionario func, String dep) {
        Departamento departamento = buscarDepartamento(nome);
        if (buscarFuncCpf(func.getCpf()) == null && dep != null) {
            dep.addFuncionario(func);
        }
    }

    public void remFuncionario(int cpf) {
        for (Departamento dep : departamentos) {
            dep.getFuncionarios().remove(buscarFuncCpf(cpf));
        }
    }

    //get/set
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Empresa [departamentos=" + departamentos + ", getDepartamentos()=" + getDepartamentos()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    

    
}
