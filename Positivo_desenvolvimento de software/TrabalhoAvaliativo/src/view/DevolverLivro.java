package view;

import java.util.Scanner;

import Model.Biblioteca;
import Model.Emprestimo;
import Model.Livro;
import Model.Usuario;

public class DevolverLivro {
    public static void main(String[] args, Scanner in, Biblioteca biblioteca) {
        System.out.println(" ------  Empréstimo ------");
        
        System.out.println("CPF do Usuário: ");
        int cpf = in.nextInt();
        Usuario usuario = biblioteca.buscarUsuario(cpf);

        System.out.println("ID do Livro: ");
        int idLivro = in.nextInt();
        Livro livro = biblioteca.buscarLivro(idLivro);

        Emprestimo devolver = new Emprestimo(usuario, livro);

        devolver.devolverLivro(livro, usuario);
    }
}
