package poo.collection;

import java.util.ArrayList;
import java.util.List;
import poo.ex_heranca.Livro;

public class MinhaColecao {

  public static void main(String[] args) {
    // dessa forma eu declaro uma collection
    List<Livro> livros = new ArrayList<Livro>();

    Livro l1 = new Livro("Minha coleção parte I");
    Livro l2 = new Livro("Minha coleção parte II");
    Livro l3 = new Livro("Minha coleção parte III");
    Livro l4 = new Livro("Minha coleção parte IV");

    livros.add(l1);
    livros.add(l2);
    livros.add(l3);
    livros.add(l4);

    // 1 opcao p imprimir a lista
    for (int i = 0; i < livros.size(); i++) {
      System.out.println(livros.get(i));
    }

    // opcao mais avancada p imprimir a lista
    for (Livro l : livros) {
      System.out.println(l);
    }

    livros.remove(0);
    

  }
}
