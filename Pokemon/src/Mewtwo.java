public class Mewtwo extends PokemonAbs{

  public Mewtwo(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Mewtwo");
  }
  
  @Override
  public void ataques() {
    System.out.println("Digite:");
    System.out.println("(1) - Confusão");
    System.out.println("(2) - Psíquico");
    System.out.println("(3) - Cauda de Ferro");
    System.out.println("(4) - Lança-Chamas");
    System.out.println("(5) - Bola das Sombras");
    System.out.println("(6) - Esfera de Aura");
    System.out.println("(7) - Hiper Raio");
    System.out.println("(8) - Ataque Rápido");
    System.out.println("(9) - Raio Confusao");
    System.out.println("(10) - Raio Solar");
    System.out.println("(11) - Mega Soco");
    System.out.println("(12) - Agilidade");
    System.out.println("(13) - Pancada Psíquica");
    System.out.println("(14) - Estrelas Cadentes");
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
