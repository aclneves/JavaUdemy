package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

import static oo.heranca.Direcao.*;

public class Jogo {

    public static void main(String[] args) {

        Monstro monstro = new Monstro(10, 10);
        Heroi heroi = new Heroi(10, 11);

        monstro.andar(NORTE);
        heroi.andar(NORTE);


        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("\nPrimeira rodada: ");
        System.out.println(monstro);
        System.out.println(heroi);

        monstro.andar(SUL);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("\nSegunda rodada: ");
        System.out.println(monstro);
        System.out.println(heroi);


    }
}
