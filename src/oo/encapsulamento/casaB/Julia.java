package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();
    void testeAcessos() {
        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem

        // System.out.println(sogra.segredo); atributo private não consegue acessar, ainda que esteja no mesmo pacote
        // System.out.println(sogra.facoDentroDeCasa);
        // System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);
    }
}
