public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }
public void acelerar(int andar){
     if (andar >= 0){}
     velocidade += andar;
}
public void frear(int andar){
     if (andar >= 0){
     velocidade -= andar;
     if (velocidade < 0){
        velocidade = 0;
        }
    }
}
public void exibirInformacoes() {
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
    System.out.println("Velocidade Atual: " + velocidade + " km/h");
}

public boolean estaAndando() {
    return velocidade > 0;
}



}
