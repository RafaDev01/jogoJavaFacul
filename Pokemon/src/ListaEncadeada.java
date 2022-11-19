public class ListaEncadeada{
  private No primeiro;
  private No ultimo;
  private int tamanho;
  
  public ListaEncadeada(){
    this.tamanho = 0;
  }

  public No getPrimeiro() {
    return primeiro;
  }
  
  public void setPrimeiro(No primeiro) {
    this.primeiro = primeiro;
  }
  
  public No getUltimo() {
    return ultimo;
  }
  
  public void setUltimo(No ultimo) {
    this.ultimo = ultimo;
  }
  
  public int getTamanho() {
    return tamanho;
  }
  
  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public void adicionar(PokemonAbs novoValor){
    No novoNo = new No(novoValor);
    if(this.primeiro == null && this.ultimo == null){
      this.primeiro = novoNo;
      this.ultimo = novoNo;
    }else{
      this.ultimo.setPróximo(novoNo);
      this.ultimo = novoNo;
    }
    this.tamanho++;
  }
  
  public void bubbleSortVetor(int vetor[]){
    //percorre o vetor
    for(int i=0;i<vetor.length;i++){
      //percorrendo o vetor com auxliar (j) mantendo o (i) para comparação do vetor completo
      for(int j=i+1;j<vetor.length;j++){
        //verificando se o elemento que está na posição (i) é maior que o elemento na posição (j)
        if(vetor[i] > vetor[j]){
          //variavel auxiliar necessária pra fazer a troca dos valores
          int aux = vetor[j];
          vetor[j] = vetor[i];
          vetor[i] = aux;
        }
      }
    }
  }
  
  public No get(int posicao){
    No atual = this.primeiro;
    for(int i=0; i < posicao; i++){
      //if(atual.getValor() != null) tentei usar mas não consegui
      if(atual.getPróximo() != null){
        atual = atual.getPróximo();
      }
    }
    return atual;
  }
  
  /* 
  public void bubbleSortList(){
    //vetor criado para armazenar os valores dos elementos da lista
    int valores[] = new int[this.tamanho];
    No<Pokemon> atual = this.primeiro;
    if(this.tamanho != 0){
      for(int i=0; i<this.tamanho;i++){
        //if(atual.getValor() != null) tentei usar mas não consegui
        if(atual.getPróximo() != null){
          valores[i] = atual.getValor();
          atual = atual.getPróximo();
        }
      }
      bubbleSortVetor(valores);

      atual = this.primeiro;
      for(int i=0; i<this.getTamanho();i++){
          if(atual.getPróximo() != null){ 
          atual.setValor(valores[i]); 
          atual = atual.getPróximo();
          }
        }
        for(int j=0;j<this.getTamanho();j++){
          System.out.println(get(j).getValor());
        }
    }else{
      System.out.println("Lista vazia.");
    } 
  }
  */

  
}