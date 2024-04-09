package Aula6;
//Encapsulamento: proteger, ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior
//!!! Um bom objeto encapsulado possui uma boa interface
//Interface: lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito com um objeto dessa classe.
//!!! Encapsular não é obrigatório, mas é uma boa prática para produzir Classes mais eficientes.
/*Vantagens:
 * Tornar mudanças invisíveis
 * Facilitar reutilização de código
 * Reduzir efeitos colaterais
 */

public class Controle implements Controlador { //implementar os métodos abstratos e chamar de forma automática
   
    private int volume;  //nunca deixar atributos de encapsulamento públicos
    private boolean ligado, tocando;

    public Controle() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


 //Métodos abstratos:
    
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu() {
        System.out.println("----- Menu -----");
        System.out.println("Ligado: " + this.isLigado());
        System.out.println("Tocando: " + this.isTocando());
        System.out.print("Volume: " + this.getVolume() + " ");

        for (int i = 0; i <= this.getVolume(); i += 5) {
            System.out.print("|");
        }

    }
    
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }
    
    @Override
    public void maisVolume() {
        if (this.isLigado() && this.getVolume() <= 95) {
            this.setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado() && this.getVolume() >= 5) {
            setVolume(getVolume() - 5);
        }
    }
    
    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    
    @Override
    public void play() {
        if (this.isLigado() && (!this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }  
    }



    //getter e setter é geralmente público. Privado apenas como exemplo
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
}
