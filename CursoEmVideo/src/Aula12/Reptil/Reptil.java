package Aula12.Reptil;

import Aula12.Animal;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("Rastejando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void locomover() {
        System.out.println("Som de Reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
