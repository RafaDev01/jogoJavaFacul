public class Rayquaza extends PokemonAbs{

  public Rayquaza(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Rayquaza");
  }
  
  @Override
  public void ataques() {
    System.out.println("Digite:");
    System.out.println("(1) - Hiper Raio");
    System.out.println("(2) - Raio de Gelo");
    System.out.println("(3) - Arremesso Sísmico");
    System.out.println("(4) - Poder ancestral");
    System.out.println("(5) - Cauda do dragao");
    ataqueDoPokemon(s1.nextInt());
  }

  @Override
  public double ataqueDoPokemon(int ataque) {
    if(ataque == 1){
      ataque = 150;
    }else if(ataque == 2){
      ataque = 100;
    }
      return ataque;
    }
}
