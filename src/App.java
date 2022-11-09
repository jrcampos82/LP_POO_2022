import java.util.ArrayList;
import java.util.List;

import poo.classe.Comercial;
import poo.classe.Residencia;

public class App {

  public static void main(String[] args) {
    // Scanner s = new Scanner(System.in);
    Residencia minhaCasa = new Residencia("Casa do Beto", true);
    // System.out.print("Digite o valor da casa: ");
    double valor = 1200;
    minhaCasa.setValor(valor);
    System.out.println("Valor da residencia: " + minhaCasa.alterarValor());
    System.out.println("Valor do desconto: " + minhaCasa.descontoVista());

    Comercial comercialElo = new Comercial();
    comercialElo.setValor(3000);
    System.out.println("Valor do comercial: " + comercialElo.alterarValor());
    System.out.println("Valor do desconto: " + comercialElo.descontoVista());

    Comercial comercialBruno = new Comercial();
    Comercial comercialBeto = new Comercial();
    Comercial comercialAndre = new Comercial();
    Comercial comercialAna = new Comercial();

    List<Comercial> listaComercial = new ArrayList<Comercial>();
    listaComercial.add(comercialElo);
    listaComercial.add(comercialBruno);
    listaComercial.add(comercialBeto);
    listaComercial.add(comercialAndre);
    listaComercial.add(comercialAna);

    for (int i = 0; i < listaComercial.size(); i++) {
      listaComercial.get(i).getValor();
    }

    for (Comercial c : listaComercial) {
      c.getValor();
    }

    
  }
}
