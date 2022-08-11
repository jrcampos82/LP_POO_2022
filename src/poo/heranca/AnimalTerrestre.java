package poo.heranca;

public abstract class AnimalTerrestre {
  protected String nome;
  protected String raca;
  protected int idade;
  

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRaca() {
    return this.raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public abstract void emitirSom();
}
