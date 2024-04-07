package Aula3;

public class Caneta {
    //Configurando Visibilidade de atributos e métodos (+privado, -público e #protegido(herança)):

    String modelo; //linguagem tipada //sem nada é público para pacote
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga (%): " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Caneta tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }

}
