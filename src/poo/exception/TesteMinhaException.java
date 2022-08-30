package poo.exception;

public class TesteMinhaException {

  public static void main(String[] args) throws SemLetraBException {
    String frase = "Sou um teste!";
    if (!frase.contains("b") || !frase.contains("B")) {
      throw new SemLetraBException();
    }
  }
}
