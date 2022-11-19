public interface Interface {
  public void atacar(PokemonAbs atacado);
  public void sofrerDano(Player ataque,PokemonAbs atacante);
  public void sofrerDano(Player ataque,PokemonAbs atacante,boolean critico);
  public double ataqueCritico();
  public void esquivar();
  public void ganhar();
  public void perder();
  public void empatar();
}
