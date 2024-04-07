//Crie uma classe chamada Funcionario
public class Funcionario {
    // atributos: nome, salário e cargo do funcionário
    private String nome, cargo;
    private double salario;
    private double imposto;
    
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.imposto = impostoValor(this.salario);
    }
    
    //• calcularImposto() - O valor do imposto deve ser calculado da seguinte forma: se o salário for menor ou igual a R$ 1.500,00 o imposto deve ser 5% se o salário for maior do que R$ 1.500,00 o imposto será de 10%.
    public double impostoValor(double salario){
        if (salario < 1500) {
            imposto = salario * 0.05;
            return imposto;
        } else {
            imposto = salario * 0.1;
            return imposto;
        }
    }
    
    
    //• exibirFuncionário() – Deve exibir todos os dados do funcionário e qual é o valor do imposto ele vai pagar.
    @Override
    public String toString() {
        return "Funcionário: " + this.nome + "\nCargo: " + this.cargo + "\nSalário: " + this.salario + "\nImposto: " + this.imposto;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}