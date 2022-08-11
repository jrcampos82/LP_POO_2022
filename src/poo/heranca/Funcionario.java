package poo.heranca;

public class Funcionario extends Pessoa {
  private int matricula;

  public int getMatricula() {
    return this.matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Funcionario)) {
      return false;
    }
    Funcionario funcionario = (Funcionario) o;
    return matricula == funcionario.matricula;
  }

  @Override
  public String toString() {
    return (
      "{ nome = " + this.nome + " matricula = '" + getMatricula() + "'" + "}"
    );
  }
}
