//Crie uma classe chamada Produto

public class Produto {

    //atributos: nome, preço e quantidade disponível no estoque
    private String nome;
    private double preco;
    private int estoque = 0;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }


    //• venderProduto() – Deve diminuir a quantidade do estoque do produto, a venda só pode ser realizada se houver estoque disponível.
    public void venderProduto(int quantidade){
        if (estoque >= quantidade) {
            estoque -= quantidade;
        }else {
            System.out.println("Produto não disponível para venda");
        }
    }

    //• exibirProduto() – Deve exibir os dados do produto;
    @Override
    public String toString() {
        return "O produto: " + this.nome + ", Com valor: " + this.preco + ", Possui estoque: " + this.estoque;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getEstoque() {
        return estoque;
    }


    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    

}
