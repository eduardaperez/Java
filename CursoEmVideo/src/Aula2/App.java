package Aula2;
//Criando classe, adicionando métodos e atributos e instanciando classe:
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Aula2");

        Caneta caneta1 = new Caneta();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.destampar();

        caneta1.status();
        caneta1.rabiscar();
    }
}
