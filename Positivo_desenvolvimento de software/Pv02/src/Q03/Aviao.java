package Q03;

import Q01.Veiculo;

public class Aviao extends Veiculo {
    private float pesoBagagem;

    public Aviao(int numPassagem, float valPassagem, String horaPartida, String horaRetorno, float pesoBagagem) {
        super(numPassagem, valPassagem, horaPartida, horaRetorno);
        this.pesoBagagem = pesoBagagem;
    }


    public float getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(float pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }

    @Override
    public String toString() {
        return "Aviao [pesoBagagem=" + pesoBagagem + "]";
    }
    
    
}
