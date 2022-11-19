public class No<Pokemon> {
  private Pokemon valor;
  private No<Pokemon> próximo;

  public No(Pokemon valor){
    this.valor = valor;
  }

  public Pokemon getValor() {
    return valor;
  }

  public void setValor(Pokemon valor) {
    this.valor = valor;
  }

  public No<Pokemon> getPróximo() {
    return próximo;
  }
  
  public void setPróximo(No<Pokemon> próximo) {
    this.próximo = próximo;
  }
}