package lp.ordenacao;

import java.util.Random;

public class Selection {
  private static final int TAM = 8;

  public static void main(String[] args) {
    Random rand = new Random();
    int vetor[] = new int[TAM];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = rand.nextInt(TAM * TAM - 1) + 1;
    }

    System.out.println("Vetor desordenado:");
    // print(vetor);
  }
}
