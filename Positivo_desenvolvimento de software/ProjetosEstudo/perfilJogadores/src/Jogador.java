public class Jogador {
    private String nome;
    private int pontuacao;
    private int numeroBatalhas;
    private int nivel;

    public Jogador(String nome, int pontuacao, int numeroBatalhas, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.numeroBatalhas = numeroBatalhas;
        this.nivel = nivel;
    }

    public void atualizarPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }

    public void subirDeNivel() {
        this.nivel++;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Número de Batalhas: " + numeroBatalhas);
        System.out.println("Nível: " + nivel);
    }
    
    public static Jogador batalha(Jogador jogador1, Jogador jogador2) {
        if (jogador1.nivel > jogador2.nivel) {
            return jogador1;
        } else if (jogador1.nivel < jogador2.nivel) {
            return jogador2;
        } else {
            if (jogador1.numeroBatalhas > jogador2.numeroBatalhas) {
                return jogador1;
            } else {
                return jogador2;
            }
        }
    }
}
