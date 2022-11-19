public interface Interface {
  public void atacar(PokemonAbs atacado);
  public void sofrerDano(PokemonAbs atacante);
  public void sofrerDano(PokemonAbs atacante,boolean critico);
  public double ataqueCritico();
  public void esquivar();
  public void ganhar();
  public void perder();
  public void empatar();
}
