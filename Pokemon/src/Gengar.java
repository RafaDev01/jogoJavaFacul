import java.util.Scanner;

public class Gengar extends PokemonAbs{

  public Gengar(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Gengar");
  }
  
  @Override
  public void ataques() {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Digite:");
    System.out.println("(1) - Comedor de Sonhos");
    System.out.println("(2) - Bola das Sombras");
    System.out.println("(3) - Hipnose");
    System.out.println("(4) - Vibração Sombria");
    System.out.println("(5) - Assustar");
    System.out.println("(6) - Ataque Noturno");
    System.out.println("(7) - Raio Confusão");
    System.out.println("(8) - Corte Duplo");
    System.out.println("(9) - Hiper Raio");

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
      }else{
        System.out.println("\nVoce errou o ataque!");
        atk = -100000;
      }
    setAtaque(atk);
  }
}