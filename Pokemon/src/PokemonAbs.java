import java.util.Random;
import java.util.random.*;

public abstract class PokemonAbs implements Interface{
  private String nome;
  private double ataque;
  private double defesa;
  private double vida;
  private int tipo;
  private String nomeTipo;

  public PokemonAbs(double ataque,double defesa,double vida, int tipo){
    this.ataque = ataque;
    this.defesa = defesa;
    this.vida = vida;
    this.tipo = tipo;
    setNome(nome);
    setNomeTipo(tipo);
  }
  
  public void setNomeTipo(int tipo){
    if(this.getTipo() == 1){
      this.nomeTipo = "Eletrico";
    }else if(this.getTipo() == 2){
      this.nomeTipo = "Agua";
    }else if(this.getTipo() == 3){
      this.nomeTipo = "Psiquico";
    }else if(this.getTipo() == 4){
      this.nomeTipo = "Fantasma";
    }else if(this.getTipo() == 5){
      this.nomeTipo = "Fogo";
    }else if(this.getTipo() == 6){
      this.nomeTipo = "Dragao";
    }
  }

  public String getNomeTipo() {
    return this.nomeTipo;
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

  @Override
  public double ataqueCritico(){
    RandomGenerator r1 = new Random();
    double dano = r1.nextDouble(50);
    return dano;
  }

  public void sofrerDano(PokemonAbs atacante,boolean critico){
    System.out.println(atacante.getNome() + " Aplicou um ataque critico");
    double vida = this.getVida();
    double dano = atacante.getAtaque() + ataqueCritico() - this.getDefesa();
    vida -= dano;
    System.out.println(this.getNome() + " Sofreu um dano de: "+dano);
    this.setVida(vida);
    System.out.println(this.getNome() + " Ficou com: "+ vida + " pontos de vida");
    System.out.println("=========================================================\n");
  }

  @Override
  public void esquivar(){
    System.out.println(this.getNome() + " Esquivou do ataque!\n");
  }

  @Override
  public void ganhar() {
    System.out.println("--------------------------------------------------------");
    System.out.println("[----------------> "+ this.getNome() + " ganhou <----------------]");
    System.out.println("--------------------------------------------------------\n");
  }

  @Override
  public void perder() {
    System.out.println("[----------------> "+ this.getNome() + " perdeu <----------------]\n");
  }

  @Override
  public void empatar() {
    System.out.println("[ ------------------- Ambos os pokemons foram derrotados! ----------------------]");
  }

  @Override
  public void atacar(PokemonAbs atacado){
    System.out.println(this.getNome() + " atacou " + atacado.getNome());
  }

  @Override
  public void sofrerDano(PokemonAbs atacante) {
    double vida = this.getVida();
    double dano = atacante.getAtaque() - this.getDefesa();
    vida -= dano;
    System.out.println(this.getNome() + " Sofreu um dano de: "+dano);
    this.setVida(vida);
    System.out.println(this.getNome() + " Ficou com: "+ vida + " pontos de vida");
    System.out.println("=========================================================\n");
  }

}
