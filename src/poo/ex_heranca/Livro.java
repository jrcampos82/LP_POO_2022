package poo.ex_heranca;

import java.time.LocalDate;

public class Livro {
  private String titulo;
  private String editora;
  private LocalDate dtLancamente;

  public Livro(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getEditora() {
    return this.editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public LocalDate getDtLancamente() {
    return this.dtLancamente;
  }

  public void setDtLancamente(LocalDate dtLancamente) {
    this.dtLancamente = dtLancamente;
  }

  @Override
  public String toString() {
    return "Título: " + this.titulo;
  }
}
