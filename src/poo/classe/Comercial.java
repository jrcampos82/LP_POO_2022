package poo.classe;

public class Comercial extends Construcao {
  private String cnpjDono;

  public String getCnpjDono() {
    return this.cnpjDono;
  }

  public void setCnpjDono(String cnpjDono) {
    this.cnpjDono = cnpjDono;
  }

  @Override
  public double alterarValor() {
    this.valor *= 1.2;
    return this.valor;
  }
}
