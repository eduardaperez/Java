public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Toyota", "Corolla", 2022);

        System.out.println("O carro está andando? " + carro.estaAndando());

        carro.acelerar(50);
        carro.exibirInformacoes();

        carro.frear(20);
        carro.exibirInformacoes();

        System.out.println("O carro está andando? " + carro.estaAndando());
    }
}
