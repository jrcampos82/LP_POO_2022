import poo.ex_ponto.Ponto;

public class App {

  public static void main(String[] args) throws Exception {
    Ponto p1 = new Ponto(2, 7);
    Ponto p2 = new Ponto(-2, 3);

    double result = p1.distance(p1, p2);
    System.out.println(result);
  }
}
