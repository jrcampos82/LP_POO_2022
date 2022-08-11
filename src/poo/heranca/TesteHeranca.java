package poo.heranca;

public class TesteHeranca {

  public static void main(String[] args) {
    Cao bilu = new Cao();
    bilu.setNome("bilu");
    bilu.setIdade(4);
    bilu.setRaca("maltes");

    Dono beto = new Dono();

    beto.setNome("Beto");
    beto.setEndereco("Rua X, 123");
    beto.setAnimal(bilu);

    beto.getAnimal().emitirSom();
    beto.alimentarAnimal(bilu);
    beto.andar();

    Funcionario bruno = new Funcionario();
    bruno.setMatricula(123456);
    bruno.toString();
  }
}
