import java.util.Scanner;

public class Mewtwo extends PokemonAbs{

  public Mewtwo(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Mewtwo");
  }

  @Override
  public void ataques() {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Digite:");
    System.out.println("(1) - Confusão");
    System.out.println("(2) - Psíquico");
    System.out.println("(3) - Cauda de Ferro");
    System.out.println("(4) - Lança-Chamas");
    System.out.println("(5) - Bola das Sombras");
    System.out.println("(6) - Esfera de Aura");
    System.out.println("(7) - Hiper Raio");
    System.out.println("(8) - Raio Confusao");
    System.out.println("(9) - Raio Solar");
    System.out.println("(10) - Pancada Psíquica");
    System.out.println("(11) - Estrelas Cadentes");

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
        atk = 109;
      }else if(ataque == 8){
        atk = 186;
      }else if(ataque == 9){
        atk = 165;
      }else if(ataque == 10){
        atk = 200;
      }else if(ataque == 11){
        atk = 189;
      }else{
        System.out.println("\nVoce errou o ataque!");
        atk = -100000;
      }
    setAtaque(atk);
  }
}