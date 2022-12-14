import java.util.Scanner;

public class Blastoise extends PokemonAbs{

  public Blastoise(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Blastoise");
  }

  @Override
  public void ataques() {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Digite:");
    System.out.println("(1) - Hidro bomba");
    System.out.println("(2) - Jato de agua");
    System.out.println("(3) - Hidro canhao");
    System.out.println("(4) - Quebra cranio");
    System.out.println("(5) - Bolhas");
    System.out.println("(6) - Raio de gelo");

    try{
      ataqueDoPokemon(s1.nextInt());
    }catch(Exception e){
      ataqueDoPokemon(0);
    }
  }

  @Override
  public void ataqueDoPokemon(int ataque){
    double atk = 0;
        if(ataque == 1){
          atk = 79;
        }else if(ataque == 2){
          atk = 62;
        }else if(ataque == 3){
          atk = 66;
        }else if(ataque == 4){
          atk = 60;
        }else if(ataque == 5){
          atk = 59;
        }else if(ataque == 6){
          atk = 114;
        }else{
          System.out.println("\nVoce errou o ataque!");
          atk = -100000;
        }
      setAtaque(atk);  
    } 
  }