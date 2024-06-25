package Prova02.Q01;

import java.time.LocalDate;

public abstract class Veiculo {
    private int numPassagem;
    private float valPassagem;
    private LocalDate horaPartida, horaRetorno;
    
    public Veiculo(int numPassagem, float valPassagem, LocalDate horaPartida, LocalDate horaRetorno) {
        this.numPassagem = numPassagem;
        this.valPassagem = valPassagem;
        this.horaPartida = horaPartida;
        this.horaRetorno = horaRetorno;
    }

    public int getNumPassagem() {
        return numPassagem;
    }

    public void setNumPassagem(int numPassagem) {
        this.numPassagem = numPassagem;
    }

    public float getValPassagem() {
        return valPassagem;
    }

    public void setValPassagem(float valPassagem) {
        this.valPassagem = valPassagem;
    }

    public LocalDate getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(LocalDate horaPartida) {
        this.horaPartida = horaPartida;
    }

    public LocalDate getHoraRetorno() {
        return horaRetorno;
    }

    public void setHoraRetorno(LocalDate horaRetorno) {
        this.horaRetorno = horaRetorno;
    }

    
}
