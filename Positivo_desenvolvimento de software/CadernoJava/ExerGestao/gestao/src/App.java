import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Eduarda", "Desenvolvedora", 123456789, 30);
        Funcionario f2 = new Funcionario("GHJVIk", "Pleno", 123456456, 32);
        Funcionario f3 = new Funcionario("DSTDFUJ", "Senior", 123456123, 25);

        Departamento d1 = new Departamento(new ArrayList<>(Funcionario), "Adm");
        Departamento d2 = new Departamento(new ArrayList<>(Funcionario), "RH");

        Empresa e1 = new Empresa(new ArrayList<Departamento>());

        e1.addDepartamento(d1);
        e1.addDepartamento(d2);

        e1.addFuncionario(f1, d1);
        e1.addFuncionario(f2, d2);
        e1.addFuncionario(f3, d1);

    }
}
