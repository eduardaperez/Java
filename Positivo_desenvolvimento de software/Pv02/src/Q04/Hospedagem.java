package Q04;

public class Hospedagem {
    private String nomeHotel;
    private int numQuartosReservados, qntPessoas;
    private float valorPorPessoa;
    
    public Hospedagem(String nomeHotel, int numQuartosReservados, int qntPessoas, float valorPorPessoa) {
        this.nomeHotel = nomeHotel;
        this.numQuartosReservados = numQuartosReservados;
        this.qntPessoas = qntPessoas;
        this.valorPorPessoa = valorPorPessoa;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public int getNumQuartosReservados() {
        return numQuartosReservados;
    }

    public void setNumQuartosReservados(int numQuartosReservados) {
        this.numQuartosReservados = numQuartosReservados;
    }

    public int getQntPessoas() {
        return qntPessoas;
    }

    public void setQntPessoas(int qntPessoas) {
        this.qntPessoas = qntPessoas;
    }

    public float getValorPorPessoa() {
        return valorPorPessoa;
    }

    public void setValorPorPessoa(float valorPorPessoa) {
        this.valorPorPessoa = valorPorPessoa;
    }

    @Override
    public String toString() {
        return "Hospedagem [nomeHotel=" + nomeHotel + ", numQuartosReservados=" + numQuartosReservados + ", qntPessoas="
                + qntPessoas + ", valorPorPessoa=" + valorPorPessoa + "]";
    }

    

}
