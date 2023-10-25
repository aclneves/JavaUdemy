package oo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();
    void testeAcessos() {
        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem

        // System.out.println(esposa.segredo); atributo private não consegue acessar, ainda que esteja no mesmo pacote
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
