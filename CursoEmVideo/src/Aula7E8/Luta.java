package Aula7E8;

import java.util.Random;

public class Luta {
    private Lutador desafiado; //tipo abstrato de dados
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria() == l2.getCategoria()) && (l1.getNome() != l2.getNome())) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (aprovada) {
            System.out.println(" ----- Corner 1 -----");
            this.desafiado.apresentar();
            System.out.println(" ----- Corner 2 -----");
            this.desafiante.apresentar();
            System.out.println("\n Iniciando luta e...");

            //!!! instanciar sorteio aleatório
            Random aleatorio = new Random(); 
            int vencedor = aleatorio.nextInt(3); //criar atributo chamando sorteio, onde ele gera um número dentre os números informados em next.Int

            switch (vencedor) {
                case 0:
                    System.out.println("Empate!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println("Vitória de " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;                
                    
                case 2:
                    System.out.println("Vitória de " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;

                default:
                    System.out.println("erro");
                    break;
            }
        } else System.out.println("Não podem lutar");
        System.out.println("---------------------------");
    }

    // get/set
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    
}
