public class Charmander extends PokemonAbs{

  public Charmander(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Charmader");
  }
  
  @Override
  public void ataques() {
    System.out.println("Digite:");
    System.out.println("(1) - Rosnar");
    System.out.println("(2) - Presas de Fogo");
    System.out.println("(3) - Garras de Metal");
    System.out.println("(4) - Lança-Chamas");
    System.out.println("(5) - Brasas");
    System.out.println("(6) - Explosão de Fogo");
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
