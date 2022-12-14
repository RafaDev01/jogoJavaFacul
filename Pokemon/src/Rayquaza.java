import java.util.Scanner;

public class Rayquaza extends PokemonAbs{

  public Rayquaza(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Rayquaza");
  }
  
  @Override
  public void ataques() {
      Scanner s1 = new Scanner(System.in);
      System.out.println("Digite:");
      System.out.println("(1) - Hiper Raio");
      System.out.println("(2) - Raio de Gelo");
      System.out.println("(3) - Arremesso Sísmico");
      System.out.println("(4) - Poder ancestral");
      System.out.println("(5) - Cauda do dragao");

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
      atk = 100;
    }else if(ataque == 2){
      atk = 120;
    }else if(ataque == 3){
      atk = 89;
    }else if(ataque == 4){
      atk = 150;
    }else if(ataque == 5){
      atk = 89;
    }else{
      System.out.println("\nVoce errou o ataque!");
      atk = -100000;
    }
    setAtaque(atk);
  }
}