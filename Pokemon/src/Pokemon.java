public class Pokemon extends PokemonAbs implements Interface{

  public Pokemon(String nome, double ataque, double defesa, double vida, int tipo) {
    super(nome, ataque, defesa, vida, tipo);
  }

  @Override
  public void atacar(Pokemon atacado){
    System.out.println(this.getNome() + " atacou " + atacado.getNome());
  }

  @Override
  public void sofrerDano(Pokemon atacante) {
    double vida = this.getVida();
    double dano = atacante.getAtaque() - this.getDefesa();
    vida -= dano;
    System.out.println(this.getNome() + " Sofreu um dano de: "+dano);
    this.setVida(vida);
    System.out.println(this.getNome() + " Ficou com: "+ vida + " pontos de vida");
    System.out.println("=========================================================\n");
  }

  @Override
  public void ganhar() {
    System.out.println("[----------------> "+ this.getNome() + " ganhou <----------------]\n");
  }

  @Override
  public void perder() {
    System.out.println("[----------------> "+ this.getNome() + " ganhou <----------------]\n");
  }

  @Override
  public void empatar() {
    System.out.println("[ ------------------- Ambos os pokemons foram derrotados! ----------------------]");
  }
  
}
