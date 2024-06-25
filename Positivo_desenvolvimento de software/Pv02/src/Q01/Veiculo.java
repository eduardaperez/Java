package Q01;

public class Veiculo {
    private int numPassagem;
    private float valPassagem;
    private String horaPartida, horaRetorno;
    
    public Veiculo(int numPassagem, float valPassagem, String horaPartida, String horaRetorno) {
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

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraRetorno() {
        return horaRetorno;
    }

    public void setHoraRetorno(String horaRetorno) {
        this.horaRetorno = horaRetorno;
    }
        
     
    
}
