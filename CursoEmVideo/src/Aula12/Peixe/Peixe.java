package Aula12.Peixe;

import Aula12.Animal;

public class Peixe extends Animal {
    private String corEscama;

    public void soltarBolha() {
        System.out.println("Soltando bolha");
    }

    @Override
    public void alimentar() {
        System.out.println("Nadando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Comendo substância");
    }

    @Override
    public void locomover() {
        System.out.println("Sem som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}
