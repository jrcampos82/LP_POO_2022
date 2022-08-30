import java.util.Scanner;
import poo.classe.Residencia;

public class App {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    Residencia minhaCasa = new Residencia("casa feliz", true); // cria um obj => o op new alocando memoria
    minhaCasa.setOcupada(true);
    //minhaCasa.setValor(ler.nextDouble());
    System.out.println(minhaCasa);

    Residencia casaCheia = new Residencia(10, "Casa cheia", 10, 12, true, 1000);

    System.out.println(casaCheia.getValor() + "\n" + casaCheia.getNome());
  }
}
