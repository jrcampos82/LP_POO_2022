package poo.ex_heranca;

import java.time.LocalDate;

public class Emprestimo {
  private Estudante estudante;
  private Funcionario funcionario;
  private Livro livro;
  private LocalDate dtEmprestimo;
  private LocalDate dtDevolucao;

  public Estudante getEstudante() {
    return this.estudante;
  }

  public void setEstudante(Estudante estudante) {
    this.estudante = estudante;
  }

  public Funcionario getFuncionario() {
    return this.funcionario;
  }

  public void setFuncionario(Funcionario funcionario) {
    this.funcionario = funcionario;
  }

  public Livro getLivro() {
    return this.livro;
  }

  public void setLivro(Livro livro) {
    this.livro = livro;
  }

  public LocalDate getDtEmprestimo() {
    return this.dtEmprestimo;
  }

  public void setDtEmprestimo(LocalDate dtEmprestimo) {
    this.dtEmprestimo = dtEmprestimo;
  }

  public LocalDate getDtDevolucao() {
    return this.dtDevolucao;
  }

  public void setDtDevolucao(LocalDate dtDevolucao) {
    this.dtDevolucao = dtDevolucao;
  }
}
