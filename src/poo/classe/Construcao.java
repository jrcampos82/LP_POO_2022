package poo.classe;

public abstract class Construcao {
  protected int qtoPortas;
  protected int qtoJanelas;
  protected double valor;

  public int getQtoPortas() {
    return this.qtoPortas;
  }

  public void setQtoPortas(int qtoPortas) {
    this.qtoPortas = qtoPortas;
  }

  public int getQtoJanelas() {
    return this.qtoJanelas;
  }

  public void setQtoJanelas(int qtoJanelas) {
    this.qtoJanelas = qtoJanelas;
  }

  public double getValor() {
    return this.valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}
