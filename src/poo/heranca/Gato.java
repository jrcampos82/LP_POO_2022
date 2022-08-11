package poo.heranca;

public class Gato extends AnimalTerrestre {

  public Gato() {
    super();
  }

  @Override
  //polimorfismo, sobrescrita do método emitirSom da superclasse
  public void emitirSom() {
    System.out.println("O gato " + this.nome + " diz Meoww");
  }
}
