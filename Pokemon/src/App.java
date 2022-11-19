public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada ListaPlyer1 = new ListaEncadeada();

        int contP1 = 0;
        ListaPlyer1.adicionar(new Pikachu(152, 53, 900, 1));
        ListaPlyer1.adicionar(new Gengar(160, 61, 850, 4));
        ListaPlyer1.adicionar(new Mewtwo(366, 101, 1500, 3));
        
        int contP2 = 0;
        ListaEncadeada ListaPlyer2 = new ListaEncadeada();
        ListaPlyer2.adicionar(new Blastoise(262, 98, 1200, 2));
        ListaPlyer2.adicionar(new Charmander(269, 93, 1100, 5));
        ListaPlyer2.adicionar(new Rayquaza(301, 201, 1000, 6));

        Batalha batalha = new Batalha("Rafael", "Teste");
        

        for (int i = 0; i < ListaPlyer1.getTamanho(); i++) {
            PokemonAbs pokemon1 = ListaPlyer1.get(contP1).getValor();
            PokemonAbs pokemon2 = ListaPlyer2.get(contP2).getValor();

            batalha.batalhar(pokemon1, pokemon2);
            contP1++;
            contP2++;
        }
    }
}    
