package oo.heranca.teste;

import oo.heranca.desafio.CivicTypeR;
import oo.heranca.desafio.Mobi;

public class SistemaCarro {

    public static void main(String[] args) {

        CivicTypeR civicTypeR = new CivicTypeR(0);
        Mobi mobi = new Mobi(0);


        civicTypeR.acelear();
        System.out.println(civicTypeR.velocidadeAtual);

        civicTypeR.ligarTurbo();
        civicTypeR.acelear();
        System.out.println(civicTypeR.velocidadeAtual);

        civicTypeR.ligarAr();
        civicTypeR.acelear();
        System.out.println(civicTypeR.velocidadeAtual);

        civicTypeR.desligarTurbo();
        civicTypeR.acelear();
        System.out.println(civicTypeR.velocidadeAtual);

        civicTypeR.desligarAr();
        civicTypeR.acelear();
        System.out.println(civicTypeR.velocidadeAtual);

        System.out.println(civicTypeR.velocidadeDoAr());
        System.out.println(civicTypeR);

        mobi.acelear();
        mobi.acelear();
        mobi.acelear();
        mobi.acelear();
        mobi.acelear();
        mobi.acelear();
        mobi.acelear();
        mobi.acelear();
        mobi.acelear();
        mobi.frear();
        mobi.frear();
        System.out.println(mobi);
    }
}
