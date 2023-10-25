package oo.heranca.desafio;

public interface Luxo {

    void ligarAr();
    void desligarAr();
    default Integer velocidadeDoAr() {
        return 1;
    };
}
