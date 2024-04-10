import CadernoJava.aula10.Produto;
import java.util.List;

/**
 * CadatroProduto
 * Java trabalha com ponteiros, tudo é um ponteiro
 */
public class CadatroProduto {
    private List<Produto> produtos;

    public void adicionarProduto(Produto produto){
        produto.setCod(criarCodigo());
        if (buscaProdutoId(produto.getCod()) == null && buscaProdutoNome(produto.getNome()) == null) {
            produtos.add(produto);
        }
    }

    public Produto buscaProdutoId(int id) {
        return produtos.stream().filter(p -> p.getCod() == cod).findFirst().orElse(null);
    }

    public Produto buscaProdutoNome(String nome) {
        return produtos.stream().filter(p -> p.getNome().equals(nome)).findFirst().orElse(null);
    }

    private int criarCodigo() { //método especializado - melhor
        int res = 0;

        for (Produto p : produtos) { //é array usa foreach
            if (res <= p.getCod()) {
                res = p.getCod();
            }
        }
        return ++res;
    }


    
}