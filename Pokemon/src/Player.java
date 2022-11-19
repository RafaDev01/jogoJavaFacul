import java.util.Scanner;

public class Player {
  private String nome;
  private int nivelXp = 0;
  private int vitoria = 0;
  private int derrota = 0;
  
  public Player(){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Digite o nome do player atual: ");
    this.nome = s1.nextLine();
    try {
      Scanner s2 = new Scanner(System.in);
      System.out.println("Digite o número de XP do player atual: ");
      this.nivelXp = s2.nextInt();
    } catch (Exception e) {
      System.out.println("Número de XP inválido, será atribuido o valor 10.");
      this.nivelXp = 10;
    } finally{
      System.out.println("--\n--");
    }

    this.vitoria = 0;
    this.derrota = 0;
  }
  public int getXp() {
    return nivelXp;
  }

  public void setXp(int nivelXp) {
    this.nivelXp = nivelXp;
  }
  
  public void ganharPonto(){
    this.vitoria++;
  }

  public void perderPonto(){
    this.derrota++;
  }

  public void ganharPartida(){
    System.out.println("O jogador " +this.getNome() + " ganhou a partida por: " +this.getVitoria() + " a "+ this.getDerrota());
  }
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getVitoria() {
    return vitoria;
  }
  public void setVitoria(int vitoria) {
    this.vitoria = vitoria;
  }
  public int getDerrota() {
    return derrota;
  }
  public void setDerrota(int derrota) {
    this.derrota = derrota;
  }
}
