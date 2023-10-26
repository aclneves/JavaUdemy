package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (nota1, nota2) -> (nota1 + nota2) / 2;
        System.out.println(media.apply(9.0, 7.0));

        BiFunction<Double, Double, String> resultado = (nota1, nota2) -> {
            double notaFinal = (nota1 + nota2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.0, 5.0));

        Function<Double, String> conceito = mediaFinal -> mediaFinal >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(9.0, 4.0));
    }
}
