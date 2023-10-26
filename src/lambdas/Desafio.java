package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Produto ipad = new Produto("IPad", 5000, 0.15);

        /*
         * 1. A partir do produto calcular o preço real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8.5%) / < 2500 (Isento)
         * 3. Frete >= 3000 (100) / < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
         */

        Function<Produto, Double> precoComDesconto = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> calculaImpostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> calculaFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        Function<Double, String> arredondaPreco = preco -> String.format("%.2f", preco);
        UnaryOperator<String> formatarPreco = preco -> "R$" + preco;

        String precoFinal = precoComDesconto
                .andThen(calculaImpostoMunicipal)
                .andThen(calculaFrete)
                .andThen(arredondaPreco)
                .andThen(formatarPreco).apply(ipad);

        System.out.println(precoFinal);


    }
}
