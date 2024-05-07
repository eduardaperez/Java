import java.util.Scanner;

import Model.Biblioteca;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do{
            System.out.println(" ------ Menu ------");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Pesquisar Livro");
            System.out.println("3 - Emprestar Livro");
            System.out.println("4 - Devolver Livro");
            System.out.println("5 - Cadastrar Usuário");
            System.out.println("6 - Relatório");
            System.out.println("0 - Sair");
            System.out.println("O que deseja fazer: ");

            opcao = in.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo do programa...");
                break;
                case 1:
                    view.CadastrarLivro.main(args, in, biblioteca);
                break;
                case 2:
                    view.PesquisarLivro.main(args, in, biblioteca);
                break;
                case 3:
                    view.DevolverLivro.main(args, in, biblioteca);
                break;
                case 4:
                    view.EmprestarLivro.main(args, in, biblioteca);
                break;
                case 5:
                    view.CadastrarUsuario.main(args, in, biblioteca);
                break;
                /*case 6:
                    view.Relatorio.main(args, biblioteca);
                    break;*/
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
            
        } while (opcao != 0);
    }
}
