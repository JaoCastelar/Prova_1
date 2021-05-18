public class App {
    public static void main(String[] args) throws Exception {
        
        Jogo jogo1 = new Jogo(1, "LOL", "RIOT GAMES", "5v5");

        jogo1.ligar();
        jogo1.desligar();
        jogo1.retMostrarStudio();

        Jogador jogador1 = new Jogador(1, "João Pedro", "Stawell", "123.456.789-01");

        jogador1.ligacao();
        jogador1.saudacao();
        jogador1.retHate();

        Campeonato campeonato1 = new Campeonato(1, "CBLOL", "RIOT GAMES", "RIOT GAMES", 500000);

        campeonato1.chamada();
        campeonato1.propaganda();
        campeonato1.retPremiacao();
    }
}
