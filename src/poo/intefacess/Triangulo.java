package poo.intefacess;

public class Triangulo implements FiguraGeometrica {

  @Override
  public double raiz(double a, double b) {
    double soma = Math.pow(a, 2) + Math.pow(b, 2);
    return Math.sqrt(soma);
  }

  @Override
  public double areaTriangulo(double a, double b) {
    return (b * a) / 2;
  }
}
