package oo.heranca.desafio;

public class CivicTypeR extends Carro implements Esportivo, Luxo {


    private static final int VELOCIDADE_MAXIMA = 270;
    private boolean ligarTurbo;
    private boolean ligarAr;

    public CivicTypeR(Integer velocidadeAtual) {
        super(VELOCIDADE_MAXIMA, velocidadeAtual);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public Integer getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else
            return 15;
    }

    @Override
    public String toString() {
        return "Civic - " +
                "Velocidade Atual: " + velocidadeAtual +
                "km/h";
    }
}
