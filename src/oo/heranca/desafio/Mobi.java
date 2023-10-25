package oo.heranca.desafio;

public class Mobi extends Carro {

    private static final int VELOCIDADE_MAXIMA = 150;

    public Mobi(Integer velocidadeAtual) {
        super(VELOCIDADE_MAXIMA, velocidadeAtual);
    }

    @Override
    public String toString() {
        return "Mobi - " +
                "Velocidade Atual: " + velocidadeAtual +
                "km/h";
    }
}
