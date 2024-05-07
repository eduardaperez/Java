package view;

import java.util.Scanner;
import Model.Biblioteca;
import Model.Usuario;

public class CadastrarUsuario {

    public static void main(String[] args, Scanner in, Biblioteca biblioteca) {
        try
        {
            System.out.println("Insera as informações para cadastro!");
            in.nextLine();
            
            System.out.println("Nome: ");
            String nome = in.nextLine();

            System.out.println("CPF: ");
            int cpf = in.nextInt();

            System.out.println("Telefone: ");
            String telefone = in.nextLine();
            in.nextLine();

            System.out.println("Data de Nascimento: ");
            String dataNasc = in.nextLine();
            
            System.out.println("Endereço: ");
            String endereco = in.nextLine();

            System.out.println("Email: ");
            String email = in.nextLine();


            Usuario novoUsuario = new Usuario(nome, cpf, telefone, dataNasc, endereco, email, cpf);

            biblioteca.adicionarUsuario(novoUsuario);

            System.out.println("Cadastro realizado com sucesso");

        }
        catch(Exception e)
        {
            System.out.println("Não foi possível Cadastrar, por favor tente novamente");
        }
    }

    public class nome {
    }
}
