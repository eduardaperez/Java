import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Professor!");


        System.out.println("\n------ Exercício 1 - Produto ------\n");
        //Crie pelo menos 2 produtos
        Produto produto1 = new Produto("Meia", 20.00, 12);
        Produto produto2 = new Produto("Calça", 120.00, 8);
        
        //exiba os seus status e em seguida 
        System.out.println(produto1.toString());
        System.out.println(produto2.toString());

        //faça duas vendas, sendo uma delas maior do que o estoque disponível
        produto1.venderProduto(2);
        produto2.venderProduto(9);

        //reexiba o status dos produtos.
        System.out.println(produto1.toString());
        System.out.println(produto2.toString());



        System.out.println("\n------ Exercício 2 - Funcionário ------\n");

        //Crie pelo menos 1 funcionário atribua a ele um salário maior do que R$ 1.500,00
        Funcionario funcionario1 = new Funcionario("Eduarda", "Desenvolvedor Júnior", 1501.0);

        //exiba o funcionário
        System.out.println(funcionario1);

        //altere o salário para um valor igual ou menor do que R$ 1.500,00
        funcionario1.setSalario(1500);

        //exiba o funcionário
        System.out.println(funcionario1);

       /*System.out.println("\n------ Exercício 3 - Aluno/Disciplina ------\n");


        Scanner scanf = new Scanner(System.in);
        
        //Aluno aluno1 = new Aluno("Eduarda", 20, ""); */ 
        
    }
    
}
