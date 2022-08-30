package poo.intefacess;

public class TesteInteface {

  public static void main(String[] args) {
    double a = 10, b = 20;
    Triangulo reto = new Triangulo();
    System.out.println("Área do triangulo = " + reto.areaTriangulo(a, b));
    System.out.println("Raiz do triangulo = " + reto.raiz(a, b));
  }
}
