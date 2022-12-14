import java.util.Scanner;

public class Pikachu extends PokemonAbs{

  public Pikachu(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Pikachu");
  }

  @Override
  public void ataques() {
      Scanner s1 = new Scanner(System.in);
      System.out.println("Digite:");
      System.out.println("(1) - Ataque Rápido");
      System.out.println("(2) - Investida Trovão");
      System.out.println("(3) - Cauda de Ferro");
      System.out.println("(4) - Choque do Trovão");
      System.out.println("(5) - Teia Elétrica");
      System.out.println("(6) - Esfera Elétrica");
      System.out.println("(7) - Batida Saca-Rolhas");
      System.out.println("(8) - Choque do Trovão Fulminante");

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
      atk = 70;
    }else if(ataque == 2){
      atk = 79;
    }else if(ataque == 3){
      atk = 69;
    }else if(ataque == 4){
      atk = 78;
    }else if(ataque == 5){
      atk = 59;
    }else if(ataque == 6){
      atk = 98;
    }else if(ataque == 7){
      atk = 87;
    }else if(ataque == 8){
      atk = 109;
    }else{
      System.out.println("\nVoce errou o ataque!");
      atk = -100000;
    }
    setAtaque(atk);
  }
}