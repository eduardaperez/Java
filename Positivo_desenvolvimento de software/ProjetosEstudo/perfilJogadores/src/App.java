public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador1 = new Jogador("jogador 1", 100, 5 ,1);
        Jogador jogador2 = new Jogador("jogador 2", 120, 4, 2);
        Jogador jogador3 = new Jogador("jogador 3", 90, 6, 2);
        Jogador jogador4 = new Jogador("jogador 4", 110, 3, 3);
        Jogador jogador5 = new Jogador("jogador 5", 80, 7, 1);
    
    Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4, jogador5};
    Jogador vencedor = jogadores[0];
        for (int i = 1; i < jogadores.length; i++) {
            vencedor = Jogador.batalha(vencedor, jogadores[i]);
        }

        vencedor.subirDeNivel();
        System.out.println("O vencedor é:");
        vencedor.exibirInformacoes();
    }
}

