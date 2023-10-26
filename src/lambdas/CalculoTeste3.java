package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        BinaryOperator<Double> soma = (a, b) -> {
            return a + b;
        };
        System.out.println(soma.apply(2.0, 3.0));

        BinaryOperator<Double> multiplicacao = (a, b) -> a * b;
        System.out.println(multiplicacao.apply(2.0, 3.0));
    }
}
