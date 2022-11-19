public abstract class PokemonAbs<Pokemon> {
  private String nome;
  private double ataque;
  private double defesa;
  private double vida;
  private int tipo;

  
  public PokemonAbs(String nome,double ataque,double defesa,double vida, int tipo){
    this.nome = nome;
    this.ataque = ataque;
    this.defesa = defesa;
    this.vida = vida;
    this.tipo = tipo;
  }
  
  public int getTipo() {
    return tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public double getAtaque() {
    return ataque;
  }
  
  public void setAtaque(double ataque) {
    this.ataque = ataque;
  }
  
  public double getDefesa() {
    return defesa;
  }
  
  public void setDefesa(double defesa) {
    this.defesa = defesa;
  }
  
  public double getVida() {
    return vida;
  }
  
  public void setVida(double vida) {
    this.vida = vida;
  }
}
