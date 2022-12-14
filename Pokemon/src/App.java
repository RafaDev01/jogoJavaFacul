public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada ListaPlyer1 = new ListaEncadeada();

        Player jogador1 = new Player();
        Player jogador2 = new Player();

        int contP1 = 0;
        ListaPlyer1.adicionar(new Pikachu(22, 42, 500, 1));
        ListaPlyer1.adicionar(new Gengar(26, 52, 600, 4));
        ListaPlyer1.adicionar(new Mewtwo(32, 64, 700, 3));
        
        int contP2 = 0;
        ListaEncadeada ListaPlyer2 = new ListaEncadeada();
        ListaPlyer2.adicionar(new Blastoise(36, 53, 600, 2));
        ListaPlyer2.adicionar(new Charmander(25, 41, 500, 5));
        ListaPlyer2.adicionar(new Rayquaza(31, 84, 490, 6));

        Batalha batalha = new Batalha(jogador1, jogador2);
        
        for (int i = 0; i < ListaPlyer1.getTamanho(); i++) {
            PokemonAbs pokemon1 = ListaPlyer1.get(contP1).getValor();

            PokemonAbs pokemon2 = ListaPlyer2.get(contP2).getValor();

            batalha.batalhar(pokemon1, pokemon2);
            contP1++;
            contP2++;
        }

        System.out.println("-------------> Resultado <-------------\n");
        if(jogador1.getVitoria() > jogador2.getVitoria()){
            jogador1.ganharPartida();
        }else{
            jogador2.ganharPartida();
        }
    }
}    