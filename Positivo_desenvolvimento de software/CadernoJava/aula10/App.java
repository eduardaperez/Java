package CadernoJava.aula10;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        System.out.println("-----Produto-----");
        
        CadastroProduto p1 = new Produto(new ArrayList<Produto>());
        p1.status();
    }
}