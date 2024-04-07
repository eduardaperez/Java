package Aula3;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Aula3");

        Caneta caneta1 = new Caneta();
        caneta1.cor = "Azul";
        //caneta1.ponta = 0.5f;
        caneta1.carga = 50;
        //caneta1.tampado;
        caneta1.tampar(); //mesmo tampado estando privado, é possível acessar acessar métodos públicos

        caneta1.status();
        caneta1.rabiscar();
    }
}
