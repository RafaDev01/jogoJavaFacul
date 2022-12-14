public class Gengar extends PokemonAbs{

  public Gengar(double forca, double defesa, double vida, int tipo) {
    super(forca, defesa, vida, tipo);
    setNome("Gengar");
  }
  
  @Override
  public void ataques() {
    System.out.println("Digite:");
    System.out.println("(1) - Comedor de Sonhos");
    System.out.println("(2) - Bola das Sombras");
    System.out.println("(3) - Hipnose");
    System.out.println("(4) - Vibração Sombria");
    System.out.println("(5) - Assustar");
    System.out.println("(6) - Ataque Noturno");
    System.out.println("(7) - Olhar Malvado");
    System.out.println("(8) - Multiplicar");
    System.out.println("(9) - Raio Confusão");
    System.out.println("(10) - Psíquico");
    System.out.println("(11) - Corte Duplo");
    System.out.println("(12) - Shadow Punch");
    System.out.println("(13) - Hiper Raio");
    System.out.println("(14) - Confusão");
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
