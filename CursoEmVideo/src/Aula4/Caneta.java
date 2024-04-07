package Aula4;

public class Caneta {
    //Métodos Especiais: Getter(acessores), Setter(modificadores) e Construct

    public String modelo, cor; //linguagem tipada //sem nada é público para pacote
    private float ponta; //precisa apenas clicar para gerar getters e setters
    private boolean tampada;

    /*public Caneta() { //este é o método construtor, não precisa tipar
        this.tampar();
        this.cor = "Azul";
    }*/

    public Caneta(String m, String c, float p) {
        this.modelo = m; //podemos fazer direto no atributo
        this.cor = c;
        this.setPonta(p); //ou settar
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }   

    void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

}
