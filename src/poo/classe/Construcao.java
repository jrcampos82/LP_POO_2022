package poo.classe;

public abstract class Construcao {
  protected double frete;
  protected double fundo;
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

  public double getFrete() {
    return this.frete;
  }

  public void setFrete(double frete) {
    this.frete = frete;
  }

  public double getFundo() {
    return this.fundo;
  }

  public void setFundo(double fundo) {
    this.fundo = fundo;
  }

  // ----------------------------------------------------------------
  public double alterarValor() {
    this.valor = this.valor * 1.1;
    return this.valor;
  }

  public double descontoVista() {
    return this.valor * 0.05;
  }

  public String toString() {
    return "toString da super classe";
  }
}
