package oo.heranca.desafio;

public class Carro {

    private final Integer VELOCIDADE_MAXIMA;
    public Integer velocidadeAtual;
    private Integer delta = 10;

    public Integer getDelta() {
        return delta;
    }
    public void setDelta(Integer delta) {
        this.delta = delta;
    }

    public Carro(Integer velocidadeMaxima, Integer velocidadeAtual) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelear() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else velocidadeAtual += getDelta();
    }


    public void frear() {
        if (velocidadeAtual > 5) {
            velocidadeAtual -= 5;
            }
        else velocidadeAtual = 0;
        }
}
