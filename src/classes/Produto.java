package classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {
    }
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double calculaDesconto(double descontoDoGerente) {
        return preco * (1 - desconto - descontoDoGerente);
    }
}
