package poo.ex_heranca;

import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {

  public static void main(String[] args) {
    int op = 0;

    List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    List<Autor> autores = new ArrayList<Autor>();
    List<Livro> livros = new ArrayList<Livro>();

    do {
      System.out.println(" +++ Sistema biblioteca +++");
      System.out.println("Escolha um opção: ");
      System.out.println("1 - Cadastrar Livro");
      System.out.println("2 - Cadastrar Funcionario");
      System.out.println("3 - Cadastrar Estudante");
      System.out.println("4- Cadastrar Autor");
      System.out.println("5 - Realizar Emprestimo");
      System.out.println("6 - Receber Emprestimo");
    } while (op != 0);
  }
}
