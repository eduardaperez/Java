public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        System.out.println("soma " + calculadora.Adicao(3, 4));
        System.out.println("subratacao " + calculadora.Subtracao(5, 2));
        System.out.println("multiplicacao " + calculadora.Multiplicacao(5, 5));
        System.out.println("divisao " + calculadora.Divisao(4, 2));
        System.out.println("Potenciacao " + calculadora.Potenciacao(2, 3));
        System.out.println("fatoração " + calculadora.Fatoracao(3));
    }
}
