package poo.intefacess;

// interface é um contrato feito entre classes
// interface são classes abstratas - todo os método tb são abstratos
// métodos abstratos são de implementação obrigatória
public interface FiguraGeometrica {
  public double PI = 3.1415;

  public double areaTriangulo(double a, double b);

  public double raiz(double a, double b);
}
