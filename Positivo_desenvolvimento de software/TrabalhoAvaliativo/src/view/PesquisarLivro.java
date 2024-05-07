package view;

import java.util.Scanner;

import Model.Biblioteca;

public class PesquisarLivro {
    public static void main(String[] args, Scanner in, Biblioteca biblioteca) {

        int opcao;
        do{
            System.out.println("Escolha a opção de busca");
            System.out.println("1 - Título");
            System.out.println("2 - Autor");
            System.out.println("3 - Categoria");
            System.out.println("4 - Código");
            System.out.println("0 - Sair");

            opcao = in.nextInt();

            

        } while (opcao != 0);


        

    }
}
