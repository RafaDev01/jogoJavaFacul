public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada<Pokemon> ListaPlyer1 = new ListaEncadeada<Pokemon>();

        int contP1 = 0;
        ListaPlyer1.adicionar(new Pokemon("Blastoise", 60, 50, 350,1));
        ListaPlyer1.adicionar(new Pokemon("Charmander", 800, 400, 1500,2));
        ListaPlyer1.adicionar(new Pokemon("Pikachu", 700, 500, 1000,3));

        int contP2 = 0;
        ListaEncadeada<Pokemon> ListaPlyer2 = new ListaEncadeada<Pokemon>();
        ListaPlyer2.adicionar(new Pokemon("Gengar", 60, 50, 350,4));
        ListaPlyer2.adicionar(new Pokemon("Alakazan", 900, 400, 1000,5));
        ListaPlyer2.adicionar(new Pokemon("Shikorita", 500, 400, 900,6));

        Batalha batalha = new Batalha("Rafael", "Teste");

        for(int i = 0; i < ListaPlyer1.getTamanho(); i++){
            Pokemon pokemon1 = ListaPlyer1.get(contP1).getValor();
            Pokemon pokemon2 = ListaPlyer2.get(contP2).getValor(); 

            batalha.batalhar(pokemon1, pokemon2);
            contP1++;
            contP2++;
        }
    }
}
