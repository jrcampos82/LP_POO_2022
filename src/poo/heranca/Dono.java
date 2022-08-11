package poo.heranca;

public class Dono extends Pessoa {
  private AnimalTerrestre animal;
  private int qtoAnimais = 0;

  // construtor
  public Dono() {
    super(); // chama o construtor da superclasse
  }

  public int getQtoAnimais() {
    return this.qtoAnimais;
  }

  public void setQtoAnimais(int qtoAnimais) {
    this.qtoAnimais = qtoAnimais;
  }

  public AnimalTerrestre getAnimal() {
    return this.animal;
  }

  public void setAnimal(AnimalTerrestre animal) {
    this.animal = animal;
  }

  public void alimentarAnimal(Cao animal) {
    System.out.println("Estou alimento o cao chamado " + animal.getNome());
  }

  public void alimentarAnimal(Gato animal) {
    System.out.println("Estou alimento meu gato chamado " + animal.getNome());
  }

  @Override
  public void andar() {
    this.passos += 2;
    System.out.println("Estou correndo");
  }
}
