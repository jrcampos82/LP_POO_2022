package poo.ex_heranca;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
  private String matricula;
  private LocalDate dtAdmissao;
  private String cargo;

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public LocalDate getDtAdmissao() {
    return this.dtAdmissao;
  }

  public void setDtAdmissao(LocalDate dtAdmissao) {
    this.dtAdmissao = dtAdmissao;
  }

  public String getCargo() {
    return this.cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }
}
