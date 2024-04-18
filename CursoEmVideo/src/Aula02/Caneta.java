package Aula02;
//Criando classe, adicionando métodos e atributos e instanciando classe:

public class Caneta {

    String modelo; //linguagem tipada
    String cor;
    float ponta;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Caneta tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }

}
