import java.util.Scanner;

public class Charmander extends PokemonAbs{

  public Charmander(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Charmader");
  }
  
  @Override
  public void ataques() {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Digite:");
    System.out.println("(1) - Rosnar");
    System.out.println("(2) - Presas de Fogo");
    System.out.println("(3) - Garras de Metal");
    System.out.println("(4) - Lança-Chamas");
    System.out.println("(5) - Brasas");
    System.out.println("(6) - Explosão de Fogo");

    try{
      ataqueDoPokemon(s1.nextInt());
    }catch(Exception e){
      ataqueDoPokemon(0);
    }
  }

  @Override
  public void ataqueDoPokemon(int ataque) {
    double atk = 0;
      if(ataque == 1){
        atk = 26;
      }else if(ataque == 2){
        atk = 50;
      }else if(ataque == 3){
        atk = 49;
      }else if(ataque == 4){
        atk = 60;
      }else if(ataque == 5){
        atk = 59;
      }else if(ataque == 6){
        atk = 109;
      }else{
        System.out.println("\nVoce errou o ataque!");
        atk = -100000;
      }
    setAtaque(atk);
  }
}