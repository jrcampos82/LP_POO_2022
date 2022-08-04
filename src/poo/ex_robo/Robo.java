package poo.ex_robo;

import poo.ex_ponto.Ponto;

public class Robo {
  Ponto position;
  char direction;

  public Robo(double _x, double _y) {
    this.position = new Ponto(_x, _y);
  }

  public void move(char dir, int qtoMove) {}

  public void top(int pos) {}

  public void down(int pos) {}

  public void left(int pos) {}

  public void right(int pos) {}
}
