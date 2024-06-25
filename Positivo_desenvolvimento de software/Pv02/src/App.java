import Q02.Barco;
import Q03.Aviao;
import Q04.Hospedagem;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----- Reserva -----");

        Barco barco = new Barco(12, 123, 550.69f, "16:30", "03:00");
        Aviao aviao = new Aviao(123, 1250.00f, "16:25", "16:52", 10.2f);
        Hospedagem hotel1 = new Hospedagem("Cancun Resort", 2, 5, 290.90f);
        Hospedagem hotel2 = new Hospedagem("BelaMar Hotel", 1, 2, 590.90f);

        
    }
}
