import java.util.Random;
import java.util.random.*;
public class Batalha {
  private Player jogador1;
  private Player jogador2;

  
  public Batalha(Player jog1, Player jog2){
    this.jogador1 = jog1;
    this.jogador2 = jog2;
  }

  public Player getJogador1() {
    return jogador1;
  }

  public void setJogador1(Player jogador1) {
    this.jogador1 = jogador1;
  }

  public Player getJogador2() {
    return jogador2;
  }

  public void setJogador2(Player jogador2) {
    this.jogador2 = jogador2;
  }

  public void apresentar(PokemonAbs poke1,PokemonAbs poke2){
    System.out.println(poke1.getNome() + " Tipo: [" + poke1.getNomeTipo() + "] --- vida: " + poke1.getVida());
    System.out.println(poke2.getNome() + " Tipo: [" + poke2.getNomeTipo() + "] --- vida: " + poke2.getVida() + "\n");
  }

  public void defineVencedor(PokemonAbs poke1,PokemonAbs poke2){

    if(poke1.getVida() > poke2.getVida() && poke1.getVida() > 0){
      poke1.ganhar();

    }else if(poke2.getVida() > poke1.getVida() && poke2.getVida() > 0){
      poke2.ganhar();
    }
  }

  public void fraqueza(PokemonAbs pokemon1, PokemonAbs pokemon2){
    if((pokemon1.getTipo() == 1) && (pokemon2.getTipo() == 2)){
      pokemon1.setAtaque(pokemon1.getAtaque() * 1.3);
    }else if((pokemon2.getTipo() == 1) && (pokemon1.getTipo() == 2)){
      pokemon2.setAtaque(pokemon2.getAtaque() * 1.3);
    }
  }
  
  public void batalhar(PokemonAbs poke1,PokemonAbs poke2){
    apresentar(poke1, poke2);
    fraqueza(poke1, poke2);
    
    RandomGenerator r1 = new Random();
    int e = 0;

    while(poke1.getVida() > 0 || poke2.getVida() > 0){
        e = r1.nextInt(50);
        poke1.atacar(poke2);
        if(e == 1 || e == 10 || e == 20 || e == 30 || e == 40 || e == 49){
          poke2.esquivar();
        }else if(e == 3 || e == 6 || e == 9 || e == 22 || e == 29 || e == 31 || e == 44){  
          poke1.ataqueCritico();
          poke2.sofrerDano(jogador1,poke1,true);
        }else{
          poke2.sofrerDano(jogador1,poke1);
        }
        if(poke2.getVida() <= 0){
          jogador1.ganharPonto();
          jogador2.perderPonto();
          break;
        }

        e = r1.nextInt(50);
        poke2.atacar(poke1);
        if(e == 1 || e == 10 || e == 20 || e == 30 || e == 40 || e == 49){
          poke1.esquivar();
        }else if(e == 3 || e == 6 || e == 9 || e == 22 || e == 29 || e == 31 || e == 44){  
          poke2.ataqueCritico();
          poke1.sofrerDano(jogador2,poke2,true);
        }else{
          poke1.sofrerDano(jogador2,poke2);
            if(poke1.getVida() <= 0){
              jogador2.ganharPonto();
              jogador1.perderPonto();
              break;
            }
          }  
        } 
    defineVencedor(poke1, poke2);
  }
}
