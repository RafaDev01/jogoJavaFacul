public class Pikachu extends PokemonAbs{

  public Pikachu(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Pikachu");
  }

  @Override
  public void ataques() {
    System.out.println("Digite:");
    System.out.println("(1) - Ataque Rápido");
    System.out.println("(2) - Investida Trovão");
    System.out.println("(3) - Cauda de Ferro");
    System.out.println("(4) - Choque do Trovão");
    System.out.println("(5) - Teia Elétrica");
    System.out.println("(6) - Esfera Elétrica");
    System.out.println("(7) - Trovão");
    System.out.println("(8) - Batida Saca-Rolhas");
    System.out.println("(9) - Choque do Trovão Fulminante");
    System.out.println("(10) - Carreira Esmagadora");
    System.out.println("(11) - Gigavolt Destruidor");
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
