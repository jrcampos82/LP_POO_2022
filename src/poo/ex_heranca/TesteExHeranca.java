package poo.ex_heranca;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class TesteExHeranca {

  public static void main(String[] args) {
    // Obj Autor
    LocalDate dataNasc = LocalDate.of(1990, Month.JULY, 22);
    Autor beto = new Autor("José Roberto", dataNasc, "Rua X", "Computação", 2);

    // Obj Livro POO
    Livro livroPOO = new Livro("Programando em Java OO");
    livroPOO.setEditora("Editora Erica");
    LocalDate dataLancamentoPOO = LocalDate.of(2022, Month.APRIL, 10);
    livroPOO.setDtLancamente(dataLancamentoPOO);

    // Obj Livro NestJS
    Livro livroNestJS = new Livro("Programando em Nest JS");
    livroNestJS.setEditora("Editora Westminster");
    LocalDate dataLancamentoNestJS = LocalDate.of(2021, Month.NOVEMBER, 15);
    livroNestJS.setDtLancamente(dataLancamentoNestJS);

    // Obj func = leticia
    Funcionario func = new Funcionario();
    func.setNome("Leticia");
    func.setEndereco("Rua Y");
    LocalDate dataNascLeticia = LocalDate.of(1984, Month.SEPTEMBER, 16);
    func.setDtNascimento(dataNascLeticia);
    LocalDate dataAdm = LocalDate.of(2005, Month.MAY, 3);
    func.setDtAdmissao(dataAdm);
    func.setCargo("Programadora");
    func.setMatricula("1001298");

    // Obj estudante1 = bruno
    Estudante estudante1 = new Estudante();
    estudante1.setNome("Bruno");
    estudante1.setEndereco("Rua H");
    LocalDate dataNascEstudante1 = LocalDate.of(1999, Month.APRIL, 10);
    estudante1.setDtNascimento(dataNascEstudante1);
    estudante1.setRa("001");
    estudante1.setCurso("Computação");
    LocalDate dataInicio = LocalDate.of(2014, Month.FEBRUARY, 3);
    estudante1.setDtInicio(dataInicio);

    // Obj Emprestimo
    
    Emprestimo emprestimo1 = new Emprestimo();
    emprestimo1.setEstudante(estudante1);
    emprestimo1.setFuncionario(func);
    emprestimo1.setLivro(livroPOO);
    LocalDate dtEmprestimo = LocalDate.of(2022, Month.AUGUST, 16);
    LocalDate dtDevolucao = LocalDate.of(2022, Month.AUGUST, 25);
    emprestimo1.setDtEmprestimo(dtEmprestimo);
    emprestimo1.setDtDevolucao(dtDevolucao);
    //
  }
}
