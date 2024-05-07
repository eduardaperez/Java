package view;

import java.util.Scanner;
import Model.Biblioteca;
import Model.Livro;
import util.Util;

public class CadastrarLivro {

    public static void main(String[] args, Scanner in, Biblioteca biblioteca) {
        try
        {
            System.out.println("Insera as informações para cadastro!");
            in.nextLine();
            
            System.out.println("Título: ");
            String titulo = in.nextLine();

            System.out.println("Autor: ");
            String autor = in.nextLine();

            System.out.println("Ano de publicação: ");
            int ano = in.nextInt();
            
            System.out.println("Número de exemplares: ");
            int numExemplares = in.nextInt();


            Livro novoLivro = new Livro(titulo, autor, ano, numExemplares, Util.gerarIdLivro());

            biblioteca.adicionarLivro(novoLivro);

        }
        catch(Exception e)
        {
            System.out.println("Não foi possível Cadastrar, por favor tente novamente");
        }
    }
}
