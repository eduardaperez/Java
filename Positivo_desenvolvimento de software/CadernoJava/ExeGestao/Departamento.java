package ExeGestao;

import java.util.List;

import ExeGestao.Funcionario;

public class Departamento {

    private List<Funcionario> funcionarios;
    private String nome;

    public String Departamento(String nome, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    
}
