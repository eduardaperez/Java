package Aula05;
//Colocando aprendizado em prática!

public class App {
    public static void main(String[] args) {
        System.out.println("Aula 5");

        ContaBanco conta1 = new ContaBanco(0001, "Maria");
        conta1.status();
        conta1.abrirConta("cc");
        conta1.status();
        conta1.depositar(10);
        conta1.fecharConta();
        conta1.sacar(110);
        conta1.pagarMensal();

    }
}
