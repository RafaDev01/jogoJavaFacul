public class No {
  private PokemonAbs valor;
  private No próximo;

  public No(PokemonAbs valor){
    this.valor = valor;
  }

  public PokemonAbs getValor() {
    return valor;
  }

  public void setValor(PokemonAbs valor) {
    this.valor = valor;
  }

  public No getPróximo() {
    return próximo;
  }
  
  public void setPróximo(No próximo) {
    this.próximo = próximo;
  }
}