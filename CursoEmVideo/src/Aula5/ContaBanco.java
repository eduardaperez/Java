package Aula5;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean aberta = false;

    public ContaBanco(int numero, String nome) {
        this.setNumConta(numero);
        this.setDono(nome);
        this.setAberta(false);
        this.setSaldo(0f);
    }

    void status() {
        System.out.println("Numero conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Aberta: " + this.getAberta());
    }

    public void abrirConta(String tipo) {
        
        this.setTipo(tipo);

        if (this.tipo == "cp") {
            this.setSaldo(150f);
            this.setAberta(true);
            System.out.println("Conta Poupança criada! Seu saldo é: " + this.getSaldo());
        }else if (this.tipo == "cc") {
            this.setSaldo(50f);
            this.setAberta(true);
            System.out.println("Conta Corrente criada! Seu saldo é: " + this.getSaldo());
        }else {
            System.out.println("Tipo inválido");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setAberta(false);
            System.out.println("Conta fechada com sucesso. Aberta = " + this.getAberta());
        } else {
            System.out.println("Ainda possui valores em conta");
        }
    }

    public void depositar(float valor) {
        if (this.getAberta() == true) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Sucesso! Seu novo saldo é: " + this.getSaldo());
        } else {
            System.out.println("Conta fechada, não foi possível depositar");
        }
    }

    public void sacar(float valor) {
        if (this.getSaldo() >= valor) {
            this.setSaldo(saldo - valor);
            System.out.println("Sucesso! Seu novo saldo é: " + this.getSaldo());

        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void pagarMensal() {
        if (this.tipo == "cc") {
            this.setSaldo(getSaldo() - 12f);
            System.out.println("Sucesso! Seu novo saldo é: " + this.getSaldo());
        } else if (this.tipo == "cp") {
            this.setSaldo(getSaldo() - 20f);
            System.out.println("Sucesso! Seu novo saldo é: " + this.getSaldo());
        }
    }




    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getAberta() {
        return aberta;
    }
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
}
