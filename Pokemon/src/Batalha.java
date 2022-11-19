import java.util.Random;

public class Batalha<Tipo> {
  private String jogador1;
  private String jogador2;

  
  public Batalha(String jog1, String jog2){
    this.jogador1 = jog1;
    this.jogador2 = jog2;
  }

  public String getJogador1() {
    return jogador1;
  }

  public void setJogador1(String jogador1) {
    this.jogador1 = jogador1;
  }

  public String getJogador2() {
    return jogador2;
  }

  public void setJogador2(String jogador2) {
    this.jogador2 = jogador2;
  }

  public void apresentar(Pokemon poke1,Pokemon poke2){
    System.out.println(poke1.getNome() + " vida: " + poke1.getVida());
    System.out.println(poke2.getNome() + " vida: " + poke2.getVida() + "\n");
  }

  public void defineVencedor(Pokemon poke1,Pokemon poke2){

    if(poke1.getVida() > poke2.getVida() && poke1.getVida() > 0){
      poke1.ganhar();

    }else if(poke2.getVida() > poke1.getVida() && poke2.getVida() > 0){
      poke2.ganhar();
    }
  }

  public void batalhar(Pokemon poke1,Pokemon poke2){
      apresentar(poke1, poke2);

      while(poke1.getVida() > 0 || poke2.getVida() > 0){
        poke1.atacar(poke2);
        poke2.sofrerDano(poke1);
        if(poke2.getVida() <= 0){
          break;
        }
        poke2.atacar(poke1);
        poke1.sofrerDano(poke2);
        if(poke1.getVida() <= 0){
          break;
        }
      } 
      defineVencedor(poke1, poke2);
  }
}
