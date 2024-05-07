package Aula13.Mamifero;

public class Cachorro extends Lobo {
    
    @Override //Polimorfismo por Sobreposição
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) { //Polimorfismo por Sobrecarga condição1
        if(frase == "Quer passear?" || frase == "Oi") {
            System.out.println("Abanar e latir");
        } else System.out.println("Rosnar");
    }

    public void reagir(int hora, int min) { //Polimorfismo por Sobrecarga condição2
        if (hora<12) {
            System.out.println("Abanar");
        } else if (hora>=18) {
            System.out.println("Ignorar");
        } else System.out.println("Abanar e latir");
    }

    public void reagir(boolean dono) { //Polimorfismo por Sobrecarga condição3
        if (dono) {
            System.out.println("Abanar");
        } else System.out.println("Rosnar");
    }

    public void reagir(int idade, float peso) { //Polimorfismo por Sobrecarga condição4
        if (idade<5) {
            if (peso<10) {
                System.out.println("Abanar");
            } else System.out.println("Latir");
        } else {
            if (peso<10) {
                System.out.println("Rosnar");
            } else System.out.println("Ignorar");
        }
    }
}
