package CadernoJava.aula10;

public class Produto {
    private int cod;
    private String nome;
    private float preco;


    //construtor
    public Produto(String nome, float preco) {
        this.setCod(cod);
        this.setNome(nome);
    }

    //status
    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Código: " + this.getCod());
        System.out.println("Preço: " + this.getPreco());
    }

    //getters setters
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

   
}
