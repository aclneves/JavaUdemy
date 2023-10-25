package oo.heranca;

public class Monstro extends Jogador {

    public Monstro(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Monstro: " +
                "Posição: " +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", Vida=" + vida;
    }
}
