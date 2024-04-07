package Aula4;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Aula4");

        Caneta caneta1 = new Caneta("Crystal", "Amarelo", 0.7f);
        caneta1.setModelo("Bic");
        caneta1.modelo = "BIC"; //Está PUBLIC
        caneta1.setPonta(0.5f);
        //caneta1.ponta = 0.5f; PRIVATE
        caneta1.status();

        Caneta caneta2 = new Caneta("Crystal", "Preta", 1f);
        caneta2.destampar();
        caneta2.status();

        System.out.println("Caneta " + caneta1.getModelo() + " com ponta " + caneta1.getPonta());//atributos por get
    }
}
