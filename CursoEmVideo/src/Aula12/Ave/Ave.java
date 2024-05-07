package Aula12.Ave;

import Aula12.Animal;

public class Ave extends Animal {
    private String corPena;

    public void fazerNinho() {
        System.out.println("Fazeendo ninho");
    }

    @Override
    public void alimentar() {
        System.out.println("Voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void locomover() {
        System.out.println("Som de ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    
}
