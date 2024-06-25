package Q02;

import Q01.Veiculo;

public class Barco extends Veiculo {
    
    private int numCabine;

    public Barco(int numCabine, int numPassagem, float valPassagem, String horaPartida, String horaRetorno) {
        super(numPassagem, valPassagem, horaPartida, horaRetorno);
        this.numCabine = numCabine;
    }


    public int getNumCabine() {
        return numCabine;
    }

    public void setNumCabine(int numCabine) {
        this.numCabine = numCabine;
    }

    @Override
    public String toString() {
        return "Barco [numCabine=" + numCabine + "]";
    }

    
}
