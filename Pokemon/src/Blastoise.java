import java.util.Scanner;

public class Blastoise extends PokemonAbs{

  public Blastoise(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Blastoise");
  }

  Scanner s1 = new Scanner(System.in);

  @Override
  public void ataques() {
    System.out.println("Digite:");
    System.out.println("(1) - Hidro bomba");
    System.out.println("(2) - Jato de agua");
    System.out.println("(3) - Hidro canhao");
    System.out.println("(4) - Quebra cranio");
    System.out.println("(5) - Bolhas");
    System.out.println("(6) - Raio de gelo");
    ataqueDoPokemon(s1.nextInt());
  }

  @Override
  public double ataqueDoPokemon(int ataque){
    if(ataque == 1){
      ataque = 150;
    }else if(ataque == 2){
      ataque = 100;
    }
    return ataque;
  }
  
}
